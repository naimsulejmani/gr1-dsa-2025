package linked_lists;

import java.util.Arrays;

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
        list.addAt(2, 30);
        list.addAfter(2, 30);
        list.removeAt(2);


        System.out.println("First element: " + list.findFirst());
        System.out.println("A eshte lista e zbrazet? " + list.isEmpty());
        System.out.println("-------------------------------------");
        list.printAll();
        System.out.println("\n-------------------------------------");
        System.out.println("Last element: " + list.findLast());
        System.out.println("Total elements: " + list.size());

        System.out.println("Elementi ne poziten 3: " + list.getDataBy(2));
        System.out.println("Contains 100?: " + list.contains(100));
        System.out.println("Index of data 100: " + list.findIndexByValue(100));

        int[] array = list.toArray();

        System.out.println(Arrays.toString(array));

//        System.out.println("A eshte lista e zbrazet? " + list.isEmpty());
//        System.out.println("-------------------------------------");
//        list.printAll();
//        System.out.println("\n-------------------------------------");
    }
}









