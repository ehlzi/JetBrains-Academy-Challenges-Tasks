package FizzBuzz;
import java.util.Scanner;

/*
Fizz Buzz is a classic programming problem. Here is its slightly modified version.
Write a program that takes two integers as the input: the beginning and the end of the interval (both numbers belong to the interval).
The program should output the numbers from this interval, but if the number is divisible by 3, you should output Fizz instead of it; if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5, output FizzBuzz.
Output each number or the word on a separate line.
*/

public class FizzBizz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //intervals
        final int start = scanner.nextInt();
        final int end = scanner.nextInt();

        //constants
        final int three = 3;
        final int five = 5;
        final int remainder = 0;

        //for-loop
        for (int i = start; i <= end; i++) {

            boolean threeB = i % three == remainder;
            boolean fiveB = i % five == remainder;
            boolean bothB = i % three == remainder && i % five == remainder;

            if (bothB) {

                System.out.println("FizzBuzz");

            } else if (threeB) {

                System.out.println("Fizz");

            } else if (fiveB) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }


        }


    }

}
