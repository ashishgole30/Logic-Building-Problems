import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        /*
         * 1️⃣ Reverse a Number
         * Input: Integer
         * Output: Reverse the number.
         * 
         * Example:
         * 1234 → 4321
         * -456 → -654 (handle negative properly)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();
        boolean isnegative = false;

        if (number < 0) {
            isnegative = true;
            number = Math.abs(number);
        }
        int reverse = 0;

        while (number > 0) {
            int lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number = number / 10;
        }
        if (isnegative) {
            reverse = -reverse;
        }
        System.out.println("Reversed Number: " + reverse);
        scanner.close();
    }
}