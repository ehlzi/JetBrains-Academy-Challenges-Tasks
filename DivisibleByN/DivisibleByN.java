package DivisibleByN;

import java.util.Scanner;

/*
Write a program that reads three positive integers a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.
*/

class DivisibleByN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); //start
        int b = scanner.nextInt(); //end
        int n = scanner.nextInt(); //divisable
        int sum = 0;

        /*
        Method #1 - Formula

        final int plus = 1;

        int sum = (b - a) / n + plus;

        System.out.println(sum);
        */

        //Method #2 - For Loop

        //(initialization; condition (or range); modification)
        for (int i = a; i <= b; i++) {

            if (i % n == 0) {

                sum++;

            }

        }

        System.out.println(sum);

    }

}