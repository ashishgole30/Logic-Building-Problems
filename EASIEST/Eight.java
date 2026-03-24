import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        /*
         * 8️⃣ Count From N to 1
         * Input: N
         * Output: Print numbers from N down to 1
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Number:");
        int num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}