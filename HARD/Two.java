import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        /*
         * Q2 Harshad (Niven) Number
         * A number is Harshad if:
         * Number is divisible by the sum of its digits.
         * Example:
         * 18
         * 1+8 = 9
         * 18 % 9 == 0 → Harshad
         */

        /*
         * PSEUDOCODE
         * 1. Take A Number
         * 2. Store the number as temporary number
         * 3. Declare sum =0
         * 4.while tempno>0
         * extract lastdigit
         * add it to sum
         * tempno = tempno / 10
         * 5. if number % sum == 0{
         * harshad no
         * }
         * 6.else not harshad number
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum = sum + lastDigit;
            temp = temp / 10;
        }
        if (number % sum == 0) {
            System.out.println("IT IS A HARSHAD NUMBER");
        } else {
            System.out.println("IT IS NOT A HARSHAD NUMBER");
        }
        scanner.close();

    }
}