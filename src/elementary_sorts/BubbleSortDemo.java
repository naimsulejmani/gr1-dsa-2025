package elementary_sorts;

import shared.Helper;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        //ne array kemi addresen se ku gjendet vargu ne heap
        int[] array = Helper.generateArray(10);

        int x = -10;
        System.out.println("Vlera e x: " + x);

        setX(x);

        System.out.println("Vlera e x: " + x);

        System.out.println("Vargu i pasortuar");
        System.out.println(Arrays.toString(array));

        BubbleSort.sort(array);

        System.out.println("Vargu i sortuar");
        System.out.println(Arrays.toString(array));
    }

    public static void setX(int x) {
        x = Math.abs(x);
    }
}
