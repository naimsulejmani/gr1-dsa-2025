package linked_lists;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public Integer findFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();
    }

    public void printAll() {
        //bad choice -> i viziton krejt nyjet edhe ne fund head behet null -> list ne fund jete e zbrazet
//        while (head != null) {
//            System.out.printf("%d -> ", head.getData());
//            // shko tek elementi vijues
//            head = head.getNext();
//        }

        Node temp = head;
        while (temp != null) {
            System.out.printf("%d -> ", temp.getData());
            // shko tek elementi vijues
            temp = temp.getNext();
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            return;
        }
        head = head.getNext();
        size--;
    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            //perderisa vijuesi i rradhes eshte i ndryshum prej null
            while (temp.getNext() != null) {
                // shko te vijuesi
                temp = temp.getNext();
            }
            //tani jemi ne elementin aktual te fundit
            temp.setNext(newNode);
        }
        size++;
    }

    public Integer findLast() {
        if (isEmpty()) {
            return null;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp.getData();
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Lista eshte e zbrazet!");
            return;
        } else if (size == 1) {
            head = null;
        } else {
            Node temp = head;
            // perderisa next i nextit esht ei ndryshum prej nul
            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            // tani jemi ne elementin e fundit
            temp.setNext(null);
        }
        size--;
    }


    public int size() {
        return size;
//        if (isEmpty()) {
//            return 0;
//        }
//        int count = 0;
//        Node temp = head;
//        while (temp != null) {
//            count++;
//            temp = temp.getNext();
//        }
//        return count;
    }


    public void clear() {
        head = null;
        size = 0;
    }


    /*


addAfter(int index, int data);

removeAt(int index);
findByIndex(int index);
findByValue(int data);
toArray() -> []
setFirst(int data);
setLast(int data);
set(int index, int data);

     */
}
