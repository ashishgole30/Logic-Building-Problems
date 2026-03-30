import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        /*
         * 2️⃣ Palindrome Number
         * 121 → true
         * 123 → false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int originalNumber = scanner.nextInt();

        if (originalNumber < 0) {
            System.out.println("It is not a palindrome");
            return;
        }

        int number = originalNumber;

        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }
        if (originalNumber == reversed) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        scanner.close();
    }
}