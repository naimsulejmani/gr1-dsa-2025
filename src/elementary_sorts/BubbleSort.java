
package elementary_sorts;

import shared.Helper;

public class BubbleSort {
    public static void sort(int[] array) {
        boolean swapped = true;
        // perserite N-1 here
        for (int iPass = 0; swapped && iPass < array.length - 1; iPass++) {
            swapped = false;
            // shko per secilin fqinje prej elementit te pare deri tek i parafundit (ngase i fundit ska fqinje)
            for (int i = 0; i < array.length - 1 - iPass; i++) {
                //nese fqinji i pare eshte me i madhe se fqinji i dyte
                if (array[i] > array[i + 1]) {
                    swapped = true;
                    //nderro vendet e tyre
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;

                    Helper.swap(array, i, i + 1);
                }
            }
        }
    }
}
