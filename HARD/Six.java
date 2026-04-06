import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        /*
         * 6️⃣ Print All Prime Factors of a Number
         * Input: 60
         * Output: 2 2 3 5
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        int divisor = 2;

        while (number > 1) {
            if (number % divisor == 0) {
                System.out.println(divisor + " ");
                number = number / divisor;
            } else {
                divisor++;
            }
        }
        scanner.close();
    }
}
/*
 * ✅ What We Are Doing
 * We want to print all prime factors of a number.
 * Example:
 * 12 → 2 × 2 × 3
 * So output should be:
 * 2 2 3
 * 
 * ✅ The Pseudocode Again (Simple Version)
 * 1. Take number
 * 2. Set divisor = 2
 * 3. While number > 1
 * If number is divisible by divisor
 * Print divisor
 * Divide number by divisor
 * Else
 * Increase divisor by 1
 * That’s it.
 * 
 * 🧠 Now I’ll Explain What Is Happening
 * 
 * Step 1: Start with divisor = 2
 * Why 2?
 * Because:
 * 2 is the smallest prime number.
 * Every composite number has a prime factor starting from 2.
 * 
 * Step 2: Check → “Can this number be divided by divisor?”
 * Example: number = 12
 * Check:
 * 12 % 2 == 0 ✅
 * That means 2 is a factor.
 * So:
 * Print 2
 * Divide number = 12 / 2 = 6
 * Now number becomes 6.
 * 
 * Step 3: Why we don’t increase divisor immediately?
 * Because maybe 2 comes again.
 * Check:
 * 6 % 2 == 0 ✅
 * So again:
 * Print 2
 * Now number becomes 3.
 * Now check:
 * 3 % 2 != 0 ❌
 * So now we increase divisor → divisor = 3.
 * 
 * Step 4: Continue same process
 * 3 % 3 == 0 ✅
 * Print 3
 * number = 3 / 3 = 1
 * Now number becomes 1.
 * Loop stops.
 * 
 * ✅ Why This Works
 * Very simple reason:
 * When we divide the number again and again:
 * We remove one prime factor at a time.
 * The number becomes smaller each time.
 * Eventually it becomes 1.
 * And all prime factors are printed.
 * We are basically breaking the number step by step.
 * Example:
 * 12
 * → divide by 2 → 6
 * → divide by 2 → 3
 * → divide by 3 → 1
 * So we broke 12 completely.
 * 
 * 🧠 One Line Understanding
 * Start from smallest prime (2)
 * Keep dividing if possible
 * Move forward only when division is not possible
 * Stop when number becomes 1
 */