import java.util.Scanner;
/* Java Day2
Assignment 3
Program to perform addition, subtraction, multiplication and division
 */
public class Calculator {
    // add the condition for exit
    public static void main(String[] args) {
        char ret;
        int num1, num2;
        char operation;
        int result = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number ");
            num1 = sc.nextInt();
            System.out.println("enter second number");
            num2 = sc.nextInt();
            System.out.println("Enter the operation you want to perform / 'N' to exit");
            operation = sc.next().charAt(0);
            if (operation == '+') {
                result = num1 + num2;
                System.out.println("Addition result is " + result);
            } else if (operation == '-') {
                result = num1 - num2;
                System.out.println("Subtraction result is " + result);
            } else if (operation == '*') {
                result = num1 * num2;
                System.out.println("Multiplication result is " + result);
            } else if (operation == '/') {
                result = num1 / num2;
                System.out.println("Division result is " + result);
            } else {
                System.exit(0);
            }
        }while(true);
    }
}
