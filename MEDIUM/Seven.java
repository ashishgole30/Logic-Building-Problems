import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {

        /* 7️⃣ HCF / GCD of Two Numbers (Without Built-in) */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int firstNum = scanner.nextInt();

        System.out.print("Enter Second Number:");
        int secondNum = scanner.nextInt();

        int number = Math.min(firstNum, secondNum);

        int hcf = 1;

        for (int i = 1; i <= number; i++) {

            if (firstNum % i == 0 && secondNum % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF OF NUMBERS " + firstNum + " AND " + secondNum + " IS " + hcf);

        scanner.close();

    }
}

/*
 * 🔵 What is HCF / GCD?
 * It is:
 * The largest number that divides both numbers exactly.
 * Example:
 * 12 and 18
 * Divisors of 12 → 1, 2, 3, 4, 6, 12
 * Divisors of 18 → 1, 2, 3, 6, 9, 18
 * Common divisors → 1, 2, 3, 6
 * Largest = 6
 * So GCD = 6.
 * 
 * 🧠 What You Need To Think
 * 
 * 1️⃣ Take two inputs
 * Store both numbers.
 * 
 * 2️⃣ Decide range for checking
 * Important thinking:
 * The HCF can never be greater than the smaller number.
 * Example:
 * HCF of 8 and 20 can’t be more than 8.
 * So you only need to check from:
 * 1 up to the smaller number.
 * 
 * 3️⃣ Check for common divisors
 * For each number i in that range:
 * Ask:
 * Does first number divide perfectly by i?
 * Does second number divide perfectly by i?
 * If both are divisible:
 * 👉 That i is a common divisor.
 * 
 * 4️⃣ Keep Track of the Largest One
 * Each time you find a common divisor:
 * Store it.
 * Keep updating it.
 * Because as i increases,
 * the latest valid divisor will automatically be the largest.
 * 
 * 5️⃣ After Loop Ends
 * The stored value is your HCF.
 * 
 * 🧠 Example Walkthrough (12 and 18)
 * Check from 1 to 12:
 * 1 → both divisible → store 1
 * 2 → both divisible → store 2
 * 3 → both divisible → store 3
 * 4 → no
 * 5 → no
 * 6 → both divisible → store 6
 * 7 → no
 * 8 → no
 * 9 → no
 * 10 → no
 * 11 → no
 * 12 → no
 * Loop ends.
 * Last stored value = 6.
 * That’s your HCF.
 * 
 * ⚡ Important Understanding
 * LCM search → we increase upward until match found
 * HCF search → we scan upward and keep updating
 */