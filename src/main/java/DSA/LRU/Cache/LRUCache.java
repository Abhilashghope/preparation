package DSA.LRU.Cache;

import DSA.DoublyLinkedList.Node;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<T, R> {
    private final int capacity;
    private final Map<T, Node<Pair<T, R>>> map;
    private final Node<Pair<T, R>> head;
    private final Node<Pair<T, R>> tail;

    public LRUCache(int capacity) {
        this.head = new Node<Pair<T, R>>(new Pair<>(null, null));
        this.tail = new Node<Pair<T, R>>(new Pair<>(null, null));
        head.next = tail;
        tail.prev = head;
        this.map = new HashMap<T, Node<Pair<T, R>>>();
        this.capacity = capacity;
    }

    public void get(T key) {
        Node<Pair<T, R>> n = map.getOrDefault(key, null);
        if (n == null) {
            System.out.println("Cache does not contain value for key: " + key);
        } else {
            System.out.println("value:" + n.data);
            updateCache(key, n.data.value);
        }

    }

    public void put(T key, R value) {
        Node<Pair<T, R>> n = map.getOrDefault(key, null);
        System.out.println("capacity:" + capacity + " mapSize:" + map.size());
        if (this.capacity <= map.size()) {
            Node<Pair<T, R>> toBeDeleteedNode = tail.prev;
            System.out.println("Removing from cache : " + toBeDeleteedNode.data);
            map.remove(toBeDeleteedNode.data.key);
            deleteNode(tail.prev);
        }
        if (n == null) {
            Pair<T, R> pair = new Pair<>(key, value);
            n = new Node<>(pair);
            addAfterHead(n);
            map.put(key, n);

        } else {
            updateCache(key, value);
        }
    }

    public void print() {
        Node<Pair<T, R>> n = head.next;
        while (n != tail) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    private void updateCache(T key, R value) {
        Pair<T, R> pair = new Pair<>(key, value);
        Node<Pair<T, R>> tempNode = map.get(key);
        Node<Pair<T, R>> newNode = new Node<>(pair);

        deleteNode(tempNode);
        addAfterHead(newNode);
        map.put(key, newNode);

    }

    private void deleteNode(Node<Pair<T, R>> node) {
        if (node == head || node == tail)
            return;
        System.out.println("Removing from cache : " + node.data);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addAfterHead(Node<Pair<T, R>> node) {

        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
        System.out.println("Updating cache : " + node.data);
    }

}
