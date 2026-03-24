import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        /*
         * 6️⃣ Largest Digit in a Number
         * Find the largest digit inside a number.
         * Example:
         * 59382 ->9
         * 1002 → 2
         * Handle negative numbers properly.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        if (number < 0) {
            number = Math.abs(number);
        }

        if (number == 0) {
            System.out.println("Maximum Digit: 0");
            return;
        }

        int max = number % 10;
        number = number / 10;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit > max) {
                max = lastDigit;
            }
            number = number / 10;
        }

        System.out.println("Maximum Digit:" + max);
        scanner.close();
    }
}