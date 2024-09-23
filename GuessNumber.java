import java.io.IOException;

public class GuessNumber {

    public static void main(String[] args) throws IOException {
        // Generate a random number between 0 and 100 using basic math operations
        int targetNumber = (int) (Math.random() * 101);  // Random number from 0 to 100

        // Define an array for demonstration purpose
        int[] numbers = {1, 2, 3, 4, 5};  
        System.out.println("First element of array: " + numbers[0]);  // Example of array usage

        // Inform the user
        System.out.println("Guess a number between 0 and 100 or type 'quit' to exit:");

        // Initialize a placeholder for input
        String input = "";
        int guessedNumber = -1;

        while (!input.equals("quit") && guessedNumber != targetNumber) {
            // Read user input character by character
            input = "";
            char ch;
            do {
                ch = (char) System.in.read();
                if (ch != '\n' && ch != '\r') {
                    input += ch;
                }
            } while (ch != '\n' && ch != '\r');

            input = input.trim();

            // Ensure the input contains only numeric digits
            boolean isNumeric = true;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                    isNumeric = false;
                    break;
                }
            }

            // Only proceed if the input is numeric
            if (isNumeric) {
                guessedNumber = 0;
                for (int i = 0; i < input.length(); i++) {
                    guessedNumber = guessedNumber * 10 + (input.charAt(i) - '0');
                }

                // Compare the guessed number with the target number
                if (guessedNumber == targetNumber) {
                    System.out.println("Congratulations! You guessed the right number!");
                    return;
                } else if (guessedNumber < targetNumber) {
                    System.out.println("The number is higher.");
                } else {
                    System.out.println("The number is lower.");
                }
            }
        }
    }
}
