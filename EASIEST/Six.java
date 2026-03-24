import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        /*
         * 6️⃣ Check Even or Odd
         * Input: Number
         * Output: Print even or odd.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The Number " + number + " is Even");
        } else {
            System.out.println("The Number Is Odd");
        }
        scanner.close();
    }
}
