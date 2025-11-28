package DSA.DoublyLinkedList;

public class MainClass {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.removeFront();
        list.removeBack();

        list.addFront(10);
        list.traverseFront();
        list.addBack(20);
        list.traverseFront();
        list.addFront(30);
        list.traverseFront();
        list.addBack(40);
        list.traverseFront();
        list.traverseBack();

    }
}
