package ProblemStatements;

public class SimpleCalculator {
    public static void main(String[] args) {
        double a = 15, b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        if (b != 0)
            System.out.println("a / b = " + (a / b));
        else
            System.out.println("Division by zero is not allowed.");
    }
}


