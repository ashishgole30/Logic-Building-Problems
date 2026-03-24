import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        /*
         * 9️⃣ Print Square of Numbers from 1 to N
         * Input: N
         * Output: Print squares.
         * Example:
         * 1 → 1
         * 2 → 4
         * 3 → 9
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Number:");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.printf("Number: %d Square: %d\n", i, i * i);
        }
        scanner.close();
    }
}