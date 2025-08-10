import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        Calculator calc = new Calculator();
        double result = 0;
        boolean valid = true;

        switch (operation.toLowerCase()) {
            case "add":
                result = calc.add(a, b);
                break;
            case "sub":
                result = calc.sub(a, b);
                break;
            case "mul":
                result = calc.mul(a, b);
                break;
            case "div":
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    valid = false;
                } else {
                    result = calc.div(a, b);
                }
                break;
            default:
                System.out.println("Invalid operation!");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}
