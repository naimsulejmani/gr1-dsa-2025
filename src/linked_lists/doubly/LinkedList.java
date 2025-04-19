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


    public Integer findFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();
    }

    public Integer findLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getData();
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Empty list!");
            return;
        }

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        size--;
    }

    private Node findByIndex(int index) {
        if (isEmpty()) {
            System.out.println("Empty list");
            return null;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index out of range!");
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void addAt(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Index out of range!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            //sipas Mirlindit
            Node temp = findByIndex(index);
            if (temp == null) {
                return;
            }
            newNode.setPrev(temp.getPrev());
            temp.getPrev().setNext(newNode);
            newNode.setNext(temp);
            temp.setPrev(newNode);
            size++;
        }


    }

    public void addBefore(int index, int data) {
        addAt(index - 1, data);
    }

    public void addAfter(int index, int data) {
        addAt(index + 1, data);
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Empty List!");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index out of range!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node temp = findByIndex(index);
            if (temp == null) {
                return;
            }
            temp.getPrev().setNext(temp.getNext());
            temp.getNext().setPrev(temp.getPrev());
//             temp.setNext(null);
//            temp.setPrev(null);
            size--;
        }
    }

    public void removeAfter(int index) {
        removeAt(index + 1);
    }

    public void removeBefore(int index) {
        removeAt(index - 1);
    }

}












