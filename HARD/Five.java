import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = scanner.nextInt();

        while (num > 0) {

            int digit = num % 10;
            int count = 0;
            int temp = num;

            // Count frequency
            while (temp > 0) {
                int lastDigit = temp % 10;
                if (digit == lastDigit) {
                    count++;
                }
                temp = temp / 10; // MUST always reduce temp
            }

            System.out.println("Digit " + digit + " Frequency " + count);

            // Remove all occurrences of digit
            temp = num;
            int newNum = 0;
            int place = 1;

            while (temp > 0) {
                int last = temp % 10;

                if (last != digit) {
                    newNum = newNum + (last * place);
                    place = place * 10;
                }

                temp = temp / 10; // Always reduce temp (outside if)
            }

            num = newNum; // Assign AFTER rebuilding finishes
        }

        scanner.close();
    }
}
/*
 * 1️⃣ Rebuilding a Number (The Formula Idea)
 * 
 * When you extract digits using % 10, you get them from right to left. If you
 * want to build a new number from selected digits, you must place each digit in
 * its correct place value (units, tens, hundreds, etc.).
 * 
 * We use this formula:
 * newNumber = newNumber + (digit × place)
 * place = place × 10
 * 
 * Here:
 * 
 * digit is the current digit you want to keep.
 * place starts from 1 (units place).
 * After adding one digit, you multiply place by 10 so the next digit goes to
 * the tens place, then hundreds, and so on.
 * 
 * This works because numbers are built as:
 * 
 * ( digit × 1 ) +
 * ( digit × 10 ) +
 * ( digit × 100 ) ...
 * 
 * So you are literally reconstructing the number mathematically.
 * 
 * 2️⃣ Removing All Occurrences of a Particular Digit
 * 
 * To remove all occurrences of a digit (say remove all 3’s from 122334), you
 * scan the number digit by digit. For each digit:
 * 
 * If it equals the digit you want to remove → skip it.
 * If it is different → rebuild it into a new number using the rebuilding
 * formula above.
 * 
 * You repeat this until the original number becomes 0.
 * 
 * At the end, the newly built number contains only the digits you decided to
 * keep. Since you never add the unwanted digit to the new number, it
 * effectively gets completely removed.
 */