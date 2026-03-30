import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        /*
         * 8️⃣ Armstrong Number (3-digit only)
         * Check if a 3-digit number is Armstrong.
         * Armstrong rule (for 3-digit only):
         * Sum of cube of digits = original number.
         * 
         * Example:
         * 153 → 1³ + 5³ + 3³ = 153 → true
         * 123 → false
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Three Digit Number:");
        int originalNum = scanner.nextInt();
        int number = originalNum;
        if (number > 999 || number < 100) {
            System.out.println("Invalid Number");
        } else {
            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                int cubedNumber = lastDigit * lastDigit * lastDigit;
                sum = sum + cubedNumber;
                number = number / 10;
            }

            if (originalNum == sum) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        scanner.close();
    }
}