package elementary_sorts;

import shared.Helper;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] array = Helper.generateArray(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
