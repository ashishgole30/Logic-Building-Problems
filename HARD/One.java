import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        /*
         * Q1. Spy Number
         * A number is a Spy Number if:
         * Sum of digits = Product of digits
         * Example:
         * 1124
         * Sum = 1+1+2+4 = 8
         * Product = 1×1×2×4 = 8
         * → Spy Number
         */

        /*
         * PSEUDOCODE
         * 1. Take number from user
         * 2. store that number as tempone and temptwo
         * 4. Declare Sum = 0 and Product = 1
         * 4. First while loop tempone>0
         * extract last digit
         * add it to sum
         * 5. second while loop temptwo>0
         * extract last digit
         * multiply it to product
         * 6. compare sum and product
         * 7. If equal spy number
         * 8. else not spy number
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int originalNumber = scanner.nextInt();

        int tempOne = originalNumber;
        int tempTwo = originalNumber;

        int sum = 0;
        int product = 1;

        while (tempOne > 0) {
            int lastDigit = tempOne % 10;
            sum = sum + lastDigit;
            tempOne = tempOne / 10;
        }

        while (tempTwo > 0) {
            int lastDigit = tempTwo % 10;
            product = product * lastDigit;
            tempTwo = tempTwo / 10;
        }

        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not A Spy Number");
        }

        scanner.close();
    }
}