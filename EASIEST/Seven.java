import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        /*
         * 7️⃣ Find Greatest of Two Number
         * Input: Two numbers
         * Output: Print greater number.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();

        int greaternum = Math.max(num1, num2);

        System.out.println(greaternum);

        scanner.close();
    }
}