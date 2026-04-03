import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        /*
         * 8️⃣ Check Automorphic Number
         * 25 → 625 → true
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Number:");
        int originalNumber = scanner.nextInt();

        int number = originalNumber;

        int squaredNumber = number * number;

        int numberOfDigits = 0;

        while (number > 0) {
            numberOfDigits = numberOfDigits + 1;
            number = number / 10;
        }

        int divisor = (int) Math.pow(10, numberOfDigits);

        int lastDigit = squaredNumber % divisor;

        if (lastDigit == originalNumber) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("NOT Automorphic Number");
        }
        scanner.close();
    }
}
/*
 * 🔵 What is an Automorphic Number?
 * A number is automorphic if:
 * Its square ends with the same digits as the number itself.
 * Example:
 * 25
 * 25² = 625
 * 625 ends with 25 → ✅ Automorphic
 * Another example:
 * 6
 * 6² = 36
 * 36 ends with 6 → ✅ Automorphic
 * 
 * 🧠 What You’re Supposed To Do (Concept Only)
 * 
 * 1️⃣ Take input
 * Store the original number.
 * 
 * 2️⃣ Find its square
 * Multiply the number by itself.
 * Now you have:
 * originalNumber
 * square
 * 
 * 3️⃣ Compare the last digits
 * This is the important thinking part.
 * You must check:
 * Do the last digits of the square match the original number?
 * 
 * 🔎 How Do You Compare Only Last Digits?
 * Think carefully.
 * If number is:
 * 25 → 2 digits
 * You must compare last 2 digits of square.
 * If number is:
 * 376 → 3 digits
 * You must compare last 3 digits of square.
 * So the comparison length depends on:
 * 👉 How many digits the original number has.
 * 
 * 🧠 Key Thinking Step
 * You need a way to:
 * Extract the last “n” digits of the square
 * (where n = number of digits in original number)
 * How do we extract last digits in Java?
 * Using modulo.
 * Example:
 * Last 2 digits → % 100
 * Last 3 digits → % 1000
 * So the challenge becomes:
 * 
 * 👉 How do you generate that 100 or 1000 dynamically?
 * That’s the real logic part.
 * 
 * 🔥 Core Idea
 * Count how many digits original number has.
 * Create a value like:
 * 10
 * 100
 * 1000
 * 10000
 * depending on digit count.
 * Do:
 * square % thatValue
 * Compare result with original number.
 * If equal → Automorphic
 * Else → Not automorphic
 * 
 * 🧠 Example (25)
 * Digits = 2
 * So divisor = 100
 * 625 % 100 = 25
 * Compare 25 == 25 → true
 * 
 * 🧠 Example (7)
 * Digits = 1
 * So divisor = 10
 * 49 % 10 = 9
 * Compare 9 == 7 → false
 * 
 * 🎯 What You Must Figure Out
 * The only tricky part:
 * How will you calculate the “10 power digitCount” value?
 * That’s your thinking challenge.
 */