import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        /*
         * 3️⃣ Print All Divisors of a Number
         * Input: 12
         * Output: 1 2 3 4 6 12
         * 
         * (Think optimized — no need to check till n.)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " is a divisor of " + number);
            }
        }
        scanner.close();
    }
}