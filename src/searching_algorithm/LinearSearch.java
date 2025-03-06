package searching_algorithm;

public class LinearSearch {
    public static int indexOf(int[] array, int searchValue) {
//        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int[] array, int searchValue) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]== searchValue) {
//                return true;
//            }
//        }
//        return false;
        return indexOf(array, searchValue) != -1;
    }
}













