package temperature;
import java.util.Scanner;
public class calculator {

	public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // Not-a-Number
        }
        return num1 / num2;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        // Perform the corresponding operation
        if (operator == '+') {
            result = add(num1, num2);
        } else if (operator == '-') {
            result = subtract(num1, num2);
        } else if (operator == '*') {
            result = multiply(num1, num2);
        } else if (operator == '/') {
            result = divide(num1, num2);
        } else {
            System.out.println("Error: Invalid operator!");
            return;
        }

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    
		
	}

}
