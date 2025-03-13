package recursions;

public class Factorial {

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1); // 10 * (10-1)!
    }

    public static long factorialOld(int n) {
        int produce = 1;
        while (n > 0) {
            produce *= n;
            n--;
        }
        return produce;
    }

    public static void main(String[] args) {
        long fact = factorial(6);
        System.out.println(fact);
    }
}



