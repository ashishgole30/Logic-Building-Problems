import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        /*
         * 3️⃣ Sum of First N Natural Numbers
         * Input: N
         * Output: Print sum of numbers from 1 to N.
         * Example:
         * N = 5 → 15
         */

        /*
         * N = 5
         * 1+2+3+4+5 = 15
         */

        /*
         * N = 5
         * i = 1 , i<=5 ; i++
         * First iteration
         * sum = 0
         * i = 1
         * sum = sum +i
         * sum = 0+1 =1
         * sum = 1
         * 
         * Second iteration
         * sum =1
         * i =2
         * sum = 1+2 =3
         * sum = 3
         * 
         * Third Iteration
         * sum = 3
         * i= 3
         * sum = 3+3 = 6
         * sum =6
         * 
         * Forth Iteration
         * sum = 6
         * i = 4
         * sum = 6+4=10
         * sum = 10
         * 
         * Fifth iteration
         * sum = 10
         * i= 5
         * sum = 10+5=15
         * 
         * Final Sum:15
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);

        scanner.close();
    }
}
