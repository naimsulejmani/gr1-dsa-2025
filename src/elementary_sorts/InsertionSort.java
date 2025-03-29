package elementary_sorts;

public class InsertionSort {
    public static void sort(int[] array) {
        //fillo nga elementi i pare i vargut te pasortuar
        // default nga pozita 1, se pozita 0 eshte e sortuar
        for (int pointer = 1; pointer < array.length; pointer++) {
            int current = array[pointer];
            int position = pointer;

            while (position > 0 && array[position - 1] > current) {
                array[position] = array[position - 1];
                position--;
                //array[position] = array[--position];
            }
            array[position] = current;
        }
    }
}
