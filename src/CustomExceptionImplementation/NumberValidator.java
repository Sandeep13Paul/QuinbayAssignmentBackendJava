package CustomExceptionImplementation;

// Custom exception for multiple digits
class MultipleDigitException extends Exception {
    public MultipleDigitException(String message) {
        super(message);
    }
}

// Class to validate numbers
public class NumberValidator {
    public static void validateSingleDigit(int number) throws MultipleDigitException {
        // Convert absolute value to string to count digits
        String numStr = String.valueOf(Math.abs(number));

        if (numStr.length() > 1) {
            throw new MultipleDigitException(
                    "Number " + number + " has " + numStr.length() + " digits. Only single-digit numbers are allowed!");
        }
    }

    public static void main(String[] args) {
        // Test array of numbers
        int[] numbers = {5, 42, -7, 123, 0, -56, 9, 999};

        // Test each number
        for (int num : numbers) {
            try {
                System.out.println("\nChecking number: " + num);
                validateSingleDigit(num);
                System.out.println("Valid single-digit number!");
            } catch (MultipleDigitException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}