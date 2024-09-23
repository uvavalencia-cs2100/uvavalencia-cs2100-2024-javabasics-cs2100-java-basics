public class SumOfInts {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Check if an input parameter is provided
        if (args.length == 0) {
            System.out.println("Please provide a target sum as an input.");
            return;
        }

        // Convert the first character of the input string to an integer
        char inputChar = args[0].charAt(0);
        int targetSum = inputChar - '0';  // Convert character to its integer value

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
    }
}
