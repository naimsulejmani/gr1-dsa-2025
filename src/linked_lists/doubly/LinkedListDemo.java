package linked_lists.doubly;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addFirst(10);
        list.addFirst(1);
        list.addLast(40);

        System.out.println("------------ASC-----------");
        list.print();
        System.out.println("\n------------------------");

        System.out.println("------------DESC-----------");
        list.printDescending();
        System.out.println("\n------------------------");
        System.out.println("Total Elements: " + list.size());
    }
}
