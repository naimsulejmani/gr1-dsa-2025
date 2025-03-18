package recursions;

public class Collatz {
    public static void collatz(int number) {
        System.out.printf("%d ", number);
        if (number == 1) return; // rasti baze, base case
        else if (number % 2 == 0) { // nese numri eshte cift pjesto me dy
            collatz(number / 2);
        } else { // nese numri eshte tek, shumezo me tre dhe shto nje
            collatz(3 * number + 1);
        }
    }
    public static void main(String[] args) {
        collatz(7);
        System.out.println();
        collatz(111);
        System.out.println();
        collatz(1232137);

    }
}
