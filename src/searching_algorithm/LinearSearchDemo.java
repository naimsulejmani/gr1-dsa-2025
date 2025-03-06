package searching_algorithm;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] array = {5, 9, 1, -100, 23, 66, 98, 23, 100};
        int searchValue = 230;

        int index = LinearSearch.indexOf(array, searchValue);
        System.out.println("Index of " + searchValue + " is: " + index);

        searchValue = -101;
        boolean contains = LinearSearch.contains(array, searchValue);

        if (contains) {
            System.out.println("Array contains " + searchValue);
        } else {
            System.out.println("Arrays doesn't contains " + searchValue);
        }
    }
}
