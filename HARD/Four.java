import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        /*
         * 4️⃣ Check if Number is Disarium *
         * A number is Disarium if:
         * Sum of digits powered with their position equals the number.
         * Example:
         * 135
         * 1¹ + 3² + 5³ = 1 + 9 + 125 = 135
         */

        /*
         * PSEUDOCODE
         * 1. Take A Number
         * 2.Store that number as temporary number 1 and temporar number 2
         * 3.declare sum = 0;
         * declare int count = 0
         * 4.while temp no 1 >0{
         * temp1 = temp1 /10
         * count++}
         * 
         * int power = count
         * while(tempno2>0){
         * get lastdigit
         * math.pow (lastdigit , power)
         * add it so sum
         * decrease power
         * temp2 = temp2 / 10
         * }
         *
         * 5. Check if sum = number
         * 6. if yes it is Disarium
         * 7. else not
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num = scanner.nextInt();
        int t1 = num;
        int t2 = num;
        int sum = 0;
        int count = 0;

        while (t1 > 0) {
            t1 = t1 / 10;
            count++;
        }

        int pow = count;

        while (t2 > 0) {
            int ld = t2 % 10;
            int value = (int) Math.pow(ld, pow);
            sum = sum + value;
            pow--;
            t2 = t2 / 10;
        }

        if (sum == num) {
            System.out.println("DISARIUM");
        } else {
            System.out.println("NOT DISARIUM");
        }
        scanner.close();
    }
}