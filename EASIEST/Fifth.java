import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        /*
         * 5️⃣ Check Positive, Negative or Zero
         * Input: Number
         * Output: Print whether number is positive, negative or zero.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The Number " + number + " is Negative");

        } else if (number > 0) {
            System.out.println("The Number " + number + " is Positive");

        } else {
            System.out.println("The Number is Zero");
        }

        scanner.close();
    }
}
