
public class Register {
    // Add method
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Subtract method
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Multiply method
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Divide method
    public double divide(int num1, int num2) {
        // Checking for division by zero
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return (double) num1 / num2;
    }

    // Square method
    public int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Example usage
        Register calculator = new Register();

        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(8, 3));
        System.out.println("Multiplication: " + calculator.multiply(4, 6));

        try {
            System.out.println("Division: " + calculator.divide(10, 2));
            
             System.out.println("Division: " + calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Square: " + calculator.square(4));
    }
}
