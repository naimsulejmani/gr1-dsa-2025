package introduction;

import java.time.LocalDate;
import java.util.ArrayList;

public class BadArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Barcelona");
        list.add("Liverpool");
        list.addFirst("Real Madrid");
        list.addLast(100);
        list.add(23.2F);
        list.add(true);
        list.add(LocalDate.of(2000, 1, 1));
        list.add(200L);
        list.add(23.3);
        list.add('A');
        list.add(new int[]{1, 2, 3});

        list.removeLast();
        list.remove(1);
        list.remove("Liverpool");

        System.out.println(list.size());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(4));

        list.set(4, 32424.4D);

        if (list.contains("Real Madrid")) {
            System.out.println("Real Madrid is in the list");
        }

        System.out.println(list.indexOf("Real Madrid"));
        System.out.println(list.indexOf(-1230));

        int vlera = (int) list.get(0);


    }
}
