import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        /*
         * 🔟 Simple Calculator
         * Take two numbers and one operator (+, -, *, /).
         * Perform operation using if-else or switch.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1:");
        int num1 = scanner.nextInt();

        System.out.print("Enter Number 2:");
        int num2 = scanner.nextInt();

        System.out.print("Enter Operation (+ , - , * , /) :");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            default:
                System.out.println("Invalid Operation");
        }
        scanner.close();
    }
}
/* Dont forget to write break statement after each case */