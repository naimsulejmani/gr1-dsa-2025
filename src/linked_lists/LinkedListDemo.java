package linked_lists;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(1);
        list.addFirst(-100);
        list.addLast(50);
        list.addLast(100);
        list.removeLast();
        list.removeLast();


        System.out.println("First element: " + list.findFirst());
        System.out.println("A eshte lista e zbrazet? " + list.isEmpty());
        System.out.println("-------------------------------------");
        list.printAll();
        System.out.println("\n-------------------------------------");
        System.out.println("Last element: " + list.findLast());
        System.out.println("Total elements: " + list.size());

//        System.out.println("A eshte lista e zbrazet? " + list.isEmpty());
//        System.out.println("-------------------------------------");
//        list.printAll();
//        System.out.println("\n-------------------------------------");
    }
}









