import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        /*
         * 4️⃣ Product of Digits
         * 
         * Input: Integer
         * Output: Multiply all digits.
         * 
         * Example:
         * 123 → 6
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Number:");
        int number = scanner.nextInt();
        int originalnumber = number;

        int product = 1;

        if (number < 0) {
            number = number * -1;
        }

        while (number > 0) {
            int lastdigit = number % 10;
            product = product * lastdigit;
            number = number / 10;
        }

        System.out.println("Product Of Digits Of Number " + originalnumber + " Is " + product);
        scanner.close();
    }
}