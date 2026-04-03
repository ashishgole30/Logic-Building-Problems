import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        /*
         * 5️⃣ Perfect Number
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int originalNumber = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i < originalNumber; i++) {
            if (originalNumber % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == originalNumber) {
            System.out.println("PERFECT NUMBER");
        } else {
            System.out.println("NOT A PERFECT NUMBER");
        }
        scanner.close();
    }
}
/*
 * 🔵 What is a Perfect Number?
 * A number is perfect if:
 * The sum of its proper divisors (excluding the number itself) == the number
 * Example:
 * 6 → divisors are 1, 2, 3
 * 1 + 2 + 3 = 6 ✅ Perfect number
 * 
 * 🧠 What You Need To Do (Logic Thinking)
 * 
 * 1️⃣ Take input
 * Ask the user to enter a number.
 * Store it as originalNumber.
 * 
 * 2️⃣ Find its divisors
 * You must check numbers starting from 1
 * Go up to one less than the number
 * For each number i, check:
 * Does the original number divide perfectly by i?
 * (Meaning remainder is 0)
 * If yes:
 * That i is a divisor.
 * Add it to a running sum.
 * 
 * 3️⃣ Keep track of sum
 * Start sum from 0.
 * Every time you find a divisor → add it to sum.
 * 
 * 4️⃣ Compare at the end
 * After checking all possible divisors:
 * If sum == originalNumber
 * → It is a Perfect Number.
 * Otherwise
 * → Not a Perfect Number.
 * 
 * 🔎 Important Understanding
 * Do NOT include the number itself.
 * Only include numbers smaller than it.
 * 1 is always a divisor (for positive numbers).
 * 
 * 🧠 Example Walkthrough (6)
 * Check:
 * 1 → divides → add
 * 2 → divides → add
 * 3 → divides → add
 * 4 → no
 * 5 → no
 * Sum = 1 + 2 + 3 = 6
 * Compare → 6 == 6 → Perfect
 */