import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 📌 Program: Print each digit of a number from left to right
         * 🎯 Example:
         * Input: 57585
         * Output:
         * 5
         * 7
         * 5
         * 8
         * 5
         */

        var sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        var num = sc.nextInt();

        var temp = num;
        var numOfDigits = 0;

        while (temp != 0) {
            temp /= 10;
            numOfDigits++;
        }

        var divisor = (int) Math.pow(10, numOfDigits - 1);

        while (divisor != 0) {
            var digit = num / divisor;
            System.out.println(digit);

            num %= divisor;
            divisor /= 10;
        }

        sc.close(); // Always good to close resources
    }
}
