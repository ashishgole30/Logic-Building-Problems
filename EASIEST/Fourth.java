import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        /*
         * 4️⃣ Multiplication Table
         * Input: N
         * Output: Print multiplication table of N till 10.
         * Example (N=5):
         * 5 × 1 = 5
         * 5 × 2 = 10
         * ...
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        }

        scanner.close();
    }
}
