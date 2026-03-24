import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        /*
         * 3️⃣ Sum of Digits
         * 
         * Input: Integer
         * Output: Sum of all digits.
         * 
         * Example:
         * 1234 → 10
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        int originalnumber = number;

        int sum = 0;

        if (number < 0) {
            number = number * -1;
        }

        while (number > 0) {
            int lastdigit = number % 10;
            sum = sum + lastdigit;
            number = number / 10;
        }

        System.out.println("Sum Of Digits Of Number " + originalnumber + " Is " + sum);
        scanner.close();
    }
}