package recursions;

public class Mystery {
    public static int mystery(int number) {
        if (number == 0) return 0;
        return number + mystery(number - 1); // splitting & combining strategy
    }

    public static void main(String[] args) {
        System.out.println(mystery(5));
    }
}
