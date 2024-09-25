public class Factorial {

    // Method to calculate factorial using a loop
    public static int calculateFactorial(int number) {
        int factorial = 1;

        // Loop to calculate the factorial of the given number
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        // Check if a number is passed as an argument
        if (args.length > 0) {
            // Parse the input argument to an integer
            int number = Integer.parseInt(args[0]);

            // Calculate and display the factorial only for non-negative numbers
            if (number >= 0) {
                int result = calculateFactorial(number);
                System.out.println("Factorial of " + number + " is: " + result);
            }
        }
    }
}

