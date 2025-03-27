package elementary_sorts;

import shared.Helper;

public class SelectionSort {
    /*
    Per cdo pozite te vargut gjej minimumin nga pozita e ardhshme e vargut deri ne fund
    dhe nderro me pozitne e vargut nese eshte me i vogel
     */

    public static void sort(int[] array) {


        // fillo nga elementi i pare deri tek elementi i para-fundit
        for (int i = 0; i < array.length - 1; i++) {
            // gjej minimumin nga pozita ku jemi deri ne fund
            // supozo qe elementi i pare eshte minimumi
            int minIndex = i;

            // ne kete FOR - jemi duke e kerkuar poziten me vleren me te vogel ne varg
            // fillo nga elementi vijues
            for (int j = i + 1; j < array.length; j++) {
                // nese elementi vijues eshte me i vogel se elementi minimal
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Helper.swap(array, minIndex, i);
//                int temp = array[minIndex];
//                array[minIndex] = array[i];
//                array[i] = temp;

            }


        }
    }
}

















