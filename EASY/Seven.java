import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        /*
         * 7️⃣ Count Even and Odd Digits
         * Count how many even digits and odd digits are present.
         * Example:
         * 12345 → Even: 2, Odd: 3
         * 2468 → Even: 4, Odd: 0
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        // Handle negative numbers
        if (number < 0) {
            number = Math.abs(number);
        }

        int evenCount = 0;
        int oddCount = 0;

        // Special case: if number is 0
        if (number == 0) {
            evenCount = 1; // 0 is an even digit
        } else {
            while (number > 0) {
                int lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                number = number / 10;
            }
        }

        System.out.println("The Number " + originalNumber + " has "
                + evenCount + " even digits and "
                + oddCount + " odd digits.");

        scanner.close();
    }
}