import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        /*
         * 1️⃣ Check if Number is a Happy Number
         * A number is happy if repeatedly summing the square of digits eventually gives
         * 1.
         * Example:
         * 19 → 1²+9²=82 → 8²+2²=68 → 6²+8²=100 → 1
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        while (number != 1 && number != 4) {
            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                sum = sum + (lastDigit * lastDigit);
                number = number / 10;
            }
            number = sum;
        }
        if (number == 1) {
            System.out.println("happy number");
        } else {
            System.out.println("Not a happy number");
        }
        scanner.close();
    }
}