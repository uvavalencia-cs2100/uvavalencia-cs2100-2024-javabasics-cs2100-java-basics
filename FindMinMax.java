import java.util.Scanner;

public class FindMinMax {
    
    // Method to find the minimum value in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find the maximum value in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Creating an array to store the input numbers
        int[] arr = new int[n];

        // Asking the user to input the elements of the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Finding and displaying the minimum and maximum values
        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}
