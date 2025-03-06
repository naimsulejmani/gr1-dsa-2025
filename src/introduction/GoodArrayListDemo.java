package introduction;

import java.util.ArrayList;

public class GoodArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> clubs = new ArrayList<>();
        clubs.add("Barcelona");
        clubs.add("Milan");
        clubs.addFirst("Real Madrid");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);

        System.out.println(clubs.size());
        System.out.println(clubs.getFirst());

        for (String club : clubs) {
            System.out.println(club);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < clubs.size(); i++) {
            System.out.println(clubs.get(i));
        }

    }

}
