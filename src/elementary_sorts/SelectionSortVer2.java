package elementary_sorts;

import shared.Helper;

public class SelectionSortVer2 {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = minimum(array, i);
            if (minIndex != i) {
                Helper.swap(array, minIndex, i);
            }
        }
    }

    private static int minimum(int[] array, int minIndex) {
        for (int j = minIndex + 1; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }
}






