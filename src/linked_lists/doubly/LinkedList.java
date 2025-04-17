package linked_lists.doubly;

//DoublyLinkedList
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d -> ", temp.getData());
            temp = temp.getNext();
        }
    }

    public void printDescending() {
        Node temp = tail;
        while (temp != null) {
            System.out.printf("%d -> ", temp.getData());
            temp = temp.getPrev();
        }
    }

    public void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }
}












