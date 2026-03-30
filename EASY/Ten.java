import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        /*
         * 🔟 Fibonacci Series (First N Terms)
         * Print first N Fibonacci numbers.
         * Example:
         * 5 → 0 1 1 2 3
         * Edge cases:
         * N = 1
         * N = 0
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N:");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("No fibonnaci series for 0");

        } else if (n == 1) {
            System.out.println("The first fibbonaci number is : 0");
        } else {
            int first = 0;
            int second = 1;
            System.out.print(first + " " + second + " ");
            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
        scanner.close();
    }
}