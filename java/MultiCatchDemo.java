public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            // Case 1: Division by zero
            int a = 10;
            int b = 0;
            int result = a / b; 
            System.out.println("Result: " + result);

            // Case 2: Array index out of bounds
            // (Note: This won't be reached if the division above fails first)
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing fourth element: " + numbers[10]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Exception message: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You accessed an index that doesn't exist.");
            System.out.println("Exception message: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block for any other unexpected errors
            System.out.println("An unexpected error occurred: " + e);
        }
        System.out.println("Program continues execution after the catch blocks...");
    }}

