import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        /*
         * 4️⃣ Strong Number
         * 145 → 1! + 4! + 5! = 145
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number");
        int originalNumber = scanner.nextInt();
        int number = originalNumber;

        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            sum = sum + factorial;
            number = number / 10;
        }

        if (sum == originalNumber) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not A Strong Number");
        }
        scanner.close();
    }
}

/*
 * original num = 145
 * number = 0riginal num = 145
 * sum = 0
 * 145>0? true
 * lastdigit = 145 % 10 = 5
 * factorial = 1
 * i= 1 , 1<= 5 true
 * factorial = 1 *1
 * factorial =1;
 * = 1 *2
 * =2
 * 2*3=
 * =6
 * 6*4=24
 * 24*5=120
 * factorial = 120
 * 5*4*3*2*1= 120
 * sum = 120
 * 145/10=14
 */

/*
 * 🟢 Correct Thinking Structure (Concept Only)
 * For each digit:
 * Extract digit
 * Compute factorial of that digit
 * Add factorial to sum
 * Move to next digit
 * So inside while loop:
 * digit = number % 10
 * factorial = 1
 * loop from 1 to digit:
 * factorial *= i
 * sum += factorial
 * Then reduce number.
 */

/*
 * 8🟡 Now Important: When To Use while vs for
 * This is critical for DSA mindset.
 * 🔹 Use while when:
 * You don’t know exact number of iterations beforehand.
 * Example:
 * Extract digits until number becomes 0
 * Read input until user types -1
 * Traverse until condition breaks
 * Strong number digit extraction → while
 * Because we don't know how many digits beforehand.
 * 
 * 🔹 Use for when:
 * You know exactly how many times it should run.
 * Example:
 * Run 5 times
 * Loop from 1 to n
 * Calculate factorial (1 to digit)
 * Factorial loop → for
 * Because factorial always runs from 1 to digit.
 */

/*
 * 🟣 Nested Loop Flow (Very Important Concept)
 * Let’s say:
 * while (condition1)
 * {
 * for (condition2)
 * {
 * // work
 * }
 * }
 * 🔄 How System Executes
 * Example number = 145
 * Step 1:
 * Outer while → digit = 5
 * Inner for runs:
 * 1 → 2 → 3 → 4 → 5
 * Calculate factorial
 * Inner finishes completely.
 * Then:
 * Outer moves to next digit (4)
 * Inner runs again fully.
 * Then:
 * Outer moves to next digit (1)
 * Inner runs again fully.
 * Then:
 * Outer ends.
 * 
 * 🔁 Rule of Nested Loops
 * Outer loop controls:
 * → How many times inner loop runs.
 * Inner loop:
 * → Fully completes each time before outer continues
 */