package ChatBot;

import java.util.Scanner;

public class ChattyBot {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        hello();
        uname();
        age();
        count();
        end();
        test();
    }

    static void hello() {

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
    }

    static void uname() {

        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
    }

    static void age() {

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {

        System.out.println("Now I will prove to you that I can count to any number you want.");

        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {

            System.out.println(i + "!");
        }

        scanner.nextLine();
    }

    static void test() {

        String op1 = "1. 1985" + "\n";
        String op2 = "2. 1984" + "\n";
        String op3 = "3. 1995" + "\n";
        String op4 = "4. 1994" + "\n";
        String op5 = "5. 1991";

        System.out.println("Let's test your programming knowledge.");
        System.out.println("What year was the first version of JAVA deployed?");
        System.out.println(op1 + op2 + op3 + op4 + op5);

        String answer = scanner.nextLine();

        switch (answer) {

            case "2", "3", "4", "5":
                System.out.println("Please, try again");
            case "1":
                end();
        }
    }
    static void end() {

        System.out.println("Congratulations, have a nice day!");
    }
}
