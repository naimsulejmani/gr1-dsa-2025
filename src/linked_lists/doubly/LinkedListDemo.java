package linked_lists.doubly;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addFirst(10);
        list.addFirst(1);
        list.addLast(40);
        list.removeFirst();
        list.removeLast();
        list.addAt(2, 25);
        list.addAt(4, 35);
        list.addAt(0, 5);
        list.removeAt(3);
        list.removeAt(0);
        list.removeAt(3);

//        Node node = list.findByIndex(1);
//
//        node.setPrev(null);
//        node.setNext(null);

        System.out.println("------------ASC-----------");
        list.print();
        System.out.println("\n------------------------");

        System.out.println("------------DESC-----------");
        list.printDescending();
        System.out.println("\n------------------------");
        System.out.println("Total Elements: " + list.size());
    }
}
