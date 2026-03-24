import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        /*
         * 2️⃣ Count Digits in a Number
         * 
         * Input: Integer
         * Output: Total number of digits.
         * 
         * Edge case:
         * 0 → 1 digit
         */

        Scanner scanner = new Scanner(System.in);

        int digitCount = 0;

        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        int originalnumber = number;

        if (number == 0) {
            digitCount = 1;
        }

        if (number < 0) {
            number = number * -1;
        }

        while (number > 0) {
            number = number / 10;
            digitCount++;
        }

        System.out.println("Total Number Of Digits In Number " + originalnumber + " is:" + digitCount);

        scanner.close();
    }
}