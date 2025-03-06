package searching_algorithm;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] array = {2, 7, 16, 23, 34, 56, 76, 89, 99, 100};
        int searchValue = 23;

        int index = BinarySearch.indexOf(array, searchValue);
        System.out.println("Index of " + searchValue + " is: " + index);
    }
}
