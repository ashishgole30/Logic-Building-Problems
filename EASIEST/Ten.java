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
                int sum = num1 + num2;
                System.out.println(sum);
                break;
            case '-':
                int difference = num1 - num2;
                System.out.println(difference);
                break;
            case '*':
                int product = num1 * num2;
                System.out.println(product);
                break;
            case '/':
                int divison = num1 / num2;
                System.out.println(divison);
                break;
            default:
                System.out.println("Invalid Operation");
        }
        scanner.close();
    }
}

/* Dont forget to write break statement after each case */