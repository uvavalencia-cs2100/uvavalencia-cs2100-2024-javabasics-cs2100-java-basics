import java.util.Scanner;  // Import the Scanner class

public class SumOfInts {

    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the target sum
        System.out.print("Please enter a target sum: ");
        int targetSum = scanner.nextInt();  // Read the input number

        // Simple loops to find pairs that add up to the target sum
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[j];

                if (firstNumber + secondNumber == targetSum) {
                    // Print the two numbers that add up to the target sum
                    System.out.println(firstNumber + " + " + secondNumber + " = " + targetSum);
                }
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
