package DailyChallenges;
import java.util.Scanner;

/*
Given a two-digit number. Print its first digit (i.e. the number of tens).
*/

public class FirstDigit {

    public static void main(String[] args) {

        /*
        Method #1:
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int digit = num;
        final int ten = 10;

        while (digit >= ten) {

            digit = digit / ten;

        }

        System.out.println(digit);
        */

        //Method #2:

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next().charAt(0));

    }

}