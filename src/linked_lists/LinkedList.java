package linked_lists;

//https://notepad.pw/pinguinat
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


    private Node findByIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void addAfter(int index, int data) {
        //krijohet nyja e re
        Node newNode = new Node(data);
        Node temp = findByIndex(index);
        if (temp == null) {
            System.out.println("wrong index");
            return;
        }
        //nyja e re dergon ku ka dergu nyja paraprake
        newNode.setNext(temp.getNext());
        //nyja paraprake dergon tash te nyja e re
        temp.setNext(newNode);
        size++;
    }


    public void addAt(int index, int data) {
        if (index < 0 || index >= size) {
            System.out.println("Out of index range!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size - 1) {
            addLast(data);
        } else {
            addAfter(index - 1, data);
        }
    }

    public Integer getDataBy(int index) {
        Node temp = findByIndex(index);
        if (temp == null) {
            return null;
        }
        return temp.getData();
    }

    public void removeAt(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Index out of range!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node temp = findByIndex(index - 1);
            if (temp == null) {
                return;
            }
            temp.setNext(temp.getNext().getNext());
            size--;
        }
    }

    public void setFirst(int data) {
        if (isEmpty()) {
            System.out.println("Lista eshte e zbrazet!");
            return;
        }
        head.setData(data);
    }

    public void setLast(int data) {
        if (isEmpty()) {
            System.out.println("Lista eshte e zbrazet");
            return;
        }
        Node temp = findByIndex(size - 1);
        if (temp == null) {
            return;
        }
        temp.setData(data);
    }

    public void set(int index, int data) {
        Node temp = findByIndex(index);
        if (temp == null) {
            System.out.println("Not found or index out of range!");
            return;
        }
        temp.setData(data);
    }

    public int findIndexByValue(int data) {
        Node temp = head;
        int index = -1;
        while (temp != null) {
            index++;
            if (temp.getData() == data) {
                return index;
            }
            temp = temp.getNext();
        }
        return -1;
    }

    public boolean contains(int data) {
        return findIndexByValue(data) != -1;
    }

    public int[] toArray() {
        int[] array = new int[size];

        Node temp = head;
        for (int i = 0; i < size; i++) {
            array[i] = temp.getData();
            temp = temp.getNext();
        }
        return array;
    }
}
