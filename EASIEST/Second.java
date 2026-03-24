import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        /*
         * 2️⃣ Print Even Numbers from 1 to N
         * Input: N
         * Output: Print only even numbers till N.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
