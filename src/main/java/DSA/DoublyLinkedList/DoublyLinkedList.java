package DSA.DoublyLinkedList;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void addFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        this.size++;
        System.out.println("new Node added to the front:" + head.data);
    }

    public void addBack(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        this.size++;
        System.out.println("new Node added to the back:" + tail.data);
    }

    public void removeFront() {

        if (this.head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node<T> temp = this.head;
        if (getSize() == 1) {
            this.head = null;
            this.tail = null;

        } else {
            this.head = temp.next;
            temp.next = null;
        }
        System.out.println("Node is removed from the front:" + temp.data);
    }

    public void removeBack() {
        if (this.tail == null) {
            System.out.println("The list is empty");
            return;
        }
        Node<T> temp = this.tail;
        if (getSize() == 1) {
            this.tail = null;
            this.head = null;
        } else {
            this.tail = temp.prev;
            temp.prev = null;
        }
        System.out.println("Node removed from the back:" + temp.data);
    }

    public void traverseFront() {
        Node<T> temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void traverseBack() {
        Node<T> temp = this.tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }





}
