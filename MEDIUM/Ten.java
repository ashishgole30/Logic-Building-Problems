public class Ten {
    public static void main(String[] args) {
        /*
         * 🔟 Pattern Logic (Number Pyramid)
         * 1
         * 12
         * 123
         * 1234
         */

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
 * 🔵 Understand The Pattern First
 * Output:
 * 1
 * 12
 * 123
 * 1234
 * 
 * 1️⃣ How many rows are there?
 * → 4 rows.
 * 
 * 2️⃣ What changes row by row?
 * → Each row prints numbers starting from 1
 * → Ending at the row number.
 * Row 1 → print till 1
 * Row 2 → print till 2
 * Row 3 → print till 3
 * Row 4 → print till 4
 * 
 * 🧠 Core Observation
 * Each row:
 * Always starts from 1
 * Ends at the current row number
 * So the row number controls how many numbers get printed.
 * 
 * 🔥 What Structure Do You Need?
 * This is a classic:
 * Outer loop → controls rows
 * Inner loop → prints numbers inside that row
 * 
 * 🧠 Mental Breakdown
 * For each row:
 * Print numbers from 1 up to the current row number
 * After finishing that row → move to next line
 * That’s it.
 * 
 * 🎯 Ask Yourself These Questions Before Coding
 * What does outer loop represent?
 * What does inner loop represent?
 * What variable controls printing 1,2,3…?
 * When should newline happen?
 */