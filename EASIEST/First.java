import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        /*
         * 1️⃣ Print Numbers from 1 to N
         * Input: N
         * Output: Print numbers from 1 to N.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}