import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        /*
         * 5️⃣ Palindrome Number
         * Check whether a number is palindrome.
         * A number is palindrome if it reads same forward and backward.
         * Examples:
         * 121 → true
         * 123 → false
         * -121 → false (decide how you want to treat negatives — think about it)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();
        int originalNumber = number;

        int reversedNumber = 0;

        if (number < 0) {
            System.out.println(false);
            return;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }

        if (reversedNumber == originalNumber) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        scanner.close();
    }
}