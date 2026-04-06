import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        /*
         * 3️⃣ Neon Number
         * A number is Neon if:
         * Sum of digits of its square = the number.
         * Example:
         * 9
         * 9² = 81
         * 8+1 = 9 → Neon
         */

        /*
         * PSEUDOCODE
         * 1.take a number
         * 2.square that number , number * number
         * 3. store it in a variable sqr
         * 4. declare sum = 0
         * 4. while sqr >0
         * extract last digit
         * add last digit to sum
         * 5. check if sum == number
         * 6. if yes neon number
         * 7. if no not neon number
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        int sqr = number * number;

        int sum = 0;

        while (sqr > 0) {
            int ld = sqr % 10;
            sum = sum + ld;
            sqr = sqr / 10;
        }

        if (sum == number) {
            System.out.println("neon number");
        } else {
            System.out.println("Not neon");
        }
        scanner.close();
    }
}