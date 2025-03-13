package recursions;

public class Binary {
    public static String convert(int N) {
        if (N == 0) return "0";
        if (N == 1) return "1";
        return convert(N / 2) + N % 2;
    }

//    public static String convert1(int N) {
//        if (N == 0) return "0";
//        if (N == 1) return "1";
//
//        StringBuilder result = new StringBuilder();
//        while (N > 0) {
//            result.insert(0, N % 2); // Prepend the remainder
//            N /= 2;
//        }
//        return result.toString();
//    }

    public static void main(String[] args) {
//        System.out.println(convert(0));
//        System.out.println(convert(1));
//        System.out.println(convert(128));
//        System.out.println(convert(127));
//        System.out.println(convert(1231231334));
        String binary = convert(127);
        System.out.println(binary);
    }
}
