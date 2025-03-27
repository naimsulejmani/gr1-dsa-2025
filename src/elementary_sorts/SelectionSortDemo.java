package elementary_sorts;

import shared.Helper;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] array = Helper.generateArray(15);
//        int[] array = {123,213,1,2,-2,3};

        System.out.println("Vargu i pasortuar");
        System.out.println(Arrays.toString(array));

        SelectionSortVer2.sort(array);

        System.out.println("Vargu i sortuar");
        System.out.println(Arrays.toString(array));
    }
}











