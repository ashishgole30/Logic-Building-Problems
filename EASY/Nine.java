import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        /*
         * 9️⃣ Prime Number Check
         * Check whether a number is prime.
         * 
         * Edge cases to handle:
         * 0
         * 1
         * 2
         * negative numbers
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number == 0) {
            System.out.println("It Is Not A Prime Number");
        } else if (number == 1) {
            System.out.println("It Is Not A Prime Number");
        } else if (number == 2) {
            System.out.println("It Is A Prime Number");
        } else if (number < 0) {
            System.out.println("Negative Numbers Cannot Be Prime Numbers");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        }
        scanner.close();
    }
}