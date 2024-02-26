package Basic.Calulator;
import java.util.Scanner;
public class BasicCalculator {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Basic Calculator");
		System.out.println("Enter frist number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Choose operation: "+"\n1. +"+"\n2. -"+"\n3. *"+"\n4. /" );
		char operation = scanner.next().charAt(0);
		
		double result = 0.0;
		switch(operation) {
		case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                return;
            }
            break;
        default:
            System.out.println("Invalid operation!");
            return;
		}
		System.out.println("Result: "+ result);
	}

}
