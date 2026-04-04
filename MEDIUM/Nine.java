import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        /*
         * 9️⃣ Sum of Digits Until Single Digit (Digital Root)
         * 9875 → 2
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int originalNumber = scanner.nextInt();

        while (originalNumber >= 10)// while number has more than one digit
        {
            int sum = 0;
            int number = originalNumber;

            while (number > 0) {
                int lastDigit = number % 10;
                sum = sum + lastDigit;
                number = number / 10;
            }
            originalNumber = sum;
        }

        System.out.println(originalNumber);
        scanner.close();

    }
}

/*
 * DRY RUN
 * original number = 9875
 * 
 * 9875>= 10?TRUE
 * sum = 0
 * number = orignalnumber = 9875
 * 
 * 9875>0? TRUE
 * lastdigit = 9875%10= 5
 * sum = 0 + 5 = 5
 * number = 987
 * 
 * 987>0? TRUE
 * lastdigit = 987%10= 7
 * sum = 5 + 7 = 12
 * number = 98
 * 
 * * 98>0? TRUE
 * lastdigit = 98%10= 8
 * sum = 12 + 8 = 20
 * number = 9
 * 
 * * 9>0? TRUE
 * lastdigit = 9%10= 9
 * sum = 20 + 9 = 29
 * number = 0
 * 
 * original number = sum
 * original number = 29
 * 
 * 29>=10 true
 * repeat same process
 */

/*
 * 🔵 What Is “Sum of Digits Until Single Digit”?
 * Also called Digital Root.
 * You:
 * Take a number.
 * Add all its digits.
 * If the result has more than one digit → repeat.
 * Stop only when the result becomes a single digit.
 * 
 * 🧠 Example: 9875
 * Step 1:
 * 9 + 8 + 7 + 5 = 29
 * Step 2:
 * 2 + 9 = 11
 * Step 3:
 * 1 + 1 = 2
 * Now it’s a single digit → stop.
 * Answer = 2
 * 
 * 🎯 What You’re Supposed To Do
 * 
 * Step 1️⃣
 * Take input number.
 * 
 * Step 2️⃣
 * Extract digits one by one and sum them.
 * You already know how to:
 * Get last digit using modulo
 * Remove last digit using division
 * So use that logic.
 * 
 * Step 3️⃣
 * After summing digits:
 * Check:
 * Is the sum still more than 9?
 * If yes:
 * Repeat the digit-summing process again,
 * But now using the new sum.
 * If no:
 * Stop.
 * 
 * 🧠 Core Logic Structure
 * You basically need:
 * An outer loop that runs until number becomes single digit.
 * An inner process that calculates sum of digits.
 * 
 * 🔎 Important Thinking
 * When do you stop?
 * When number < 10.
 * Because single digit numbers are from 0 to 9.
 * So your condition should revolve around:
 * “Keep repeating while number has more than one digit.”
 * 
 * 💡 Mental Structure
 * While number has more than 1 digit:
 * Set sum = 0
 * Extract digits and add to sum
 * Replace number with sum
 * Print final number.
 * 🧠 Another Example (38)
 * 
 * 3 + 8 = 11
 * 1 + 1 = 2
 * Stop.
 */