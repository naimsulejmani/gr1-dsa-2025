package searching_algorithm;

public class Detyra3 {

    public static int sum(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        return sum;
    }

    public static long productOfArray(int[] array) {
        int product = 1;
        for (int number : array) {
            product *= number;
        }
        return product;
    }

    public static double average(int[] array) {
        double sum = sum(array);
        return sum / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }

    public static int minValueIndex(int[] array) {
        int minIndex = 0;
        int minValue = array[minIndex];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int minPerzirja(int[] array) {
        int min = min(array);
        return LinearSearch.indexOf(array, min);
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 10, 20, -10};
        int sum = sum(array);
        System.out.println("Shuma:" + sum);
        System.out.println("Prodhimi: " + productOfArray(array));
        System.out.println("Mesatarja: " + average(array));
        System.out.println("Minimumi: " + min(array));
        System.out.println("Minimum index mire: " + minValueIndex(array));
        System.out.println("Minimum index perzirja: " + minPerzirja(array));
    }
}








