import java.util.Scanner;

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
