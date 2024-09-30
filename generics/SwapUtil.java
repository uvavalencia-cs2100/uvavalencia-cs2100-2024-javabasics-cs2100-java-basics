package generics;

public class SwapUtil {

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1]; // Store the value of the first element
        array[index1] = array[index2]; // Swap the values
        array[index2] = temp; // Complete the swap
    }


    public static void main(String[] args) {
        // Example 1: Swapping integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
        swap(intArray, 0, 4);
        System.out.println("After swap: " + java.util.Arrays.toString(intArray));

        // Example 2: Swapping strings
        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("Before swap: " + java.util.Arrays.toString(strArray));
        swap(strArray, 1, 2);
        System.out.println("After swap: " + java.util.Arrays.toString(strArray));
    }
}