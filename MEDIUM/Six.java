import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        /* 6️⃣ LCM of Two Numbers (Without Built-in) */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int firstNum = scanner.nextInt();

        System.out.print("Enter Second Number:");
        int secondNum = scanner.nextInt();
        int number = Math.max(firstNum, secondNum);

        while (true) {

            if (number % firstNum == 0 && number % secondNum == 0) {
                System.out.println(number);
                break;
            } else {
                number++;
            }

        }
        scanner.close();
    }
}

/*
 * 🔵 What is LCM?
 * LCM (Least Common Multiple) means:
 * The smallest number that is divisible by both numbers.
 * Example:
 * LCM of 4 and 6
 * Multiples of 4 → 4, 8, 12, 16…
 * Multiples of 6 → 6, 12, 18…
 * First common multiple = 12
 * So LCM = 12
 * 
 * 🧠 What You Need To Do (Logic Thinking)
 * 
 * 1️⃣ Take two inputs
 * Ask user for two numbers.
 * Store them separately.
 * 
 * 2️⃣ Decide where to start checking
 * The LCM:
 * Can never be smaller than the larger number.
 * So start checking from the bigger of the two numbers.
 * Example:
 * If numbers are 4 and 6
 * Start from 6, not 1.
 * 
 * 3️⃣ Check divisibility
 * For each number starting from the bigger number:
 * Ask:
 * Is this number divisible by first number?
 * AND is it divisible by second number
 * If both conditions are true:
 * 👉 That number is the LCM.
 * 👉 Stop searching.
 * 
 * 4️⃣ Keep increasing
 * If not divisible by both:
 * Increase the number by 1
 * Check again
 * Repeat until you find it.
 * 
 * 🧠 Example Walkthrough (4 and 6)
 * Start from 6:
 * 6 → divisible by 4? ❌
 * 7 → ❌
 * 8 → divisible by 4? ✅ but by 6? ❌
 * 9 → ❌
 * 10 → ❌
 * 11 → ❌
 * 12 → divisible by 4? ✅
 * divisible by 6? ✅
 * Stop. LCM = 12.
 */