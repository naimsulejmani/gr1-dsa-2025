package searching_algorithm;

public class BinarySearch {
    public static int indexOf(int[] array, int searchValue) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            //gjej indeksin e mesit
            int mid = (low + high) / 2;

            //nese elementi i mesit eshte i barabarte me vleren qe po e kerkon
            if (array[mid] == searchValue) {
                return mid;
            }

            //nese vlera qe po e kerkojme eshte e me madhe se vlera e mesit atehere
            // lype ne gjysmen e dyte te vargut
            if (searchValue > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
