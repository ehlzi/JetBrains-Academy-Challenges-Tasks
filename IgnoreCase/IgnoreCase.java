package IgnoreCase;
import java.util.Scanner;

public class IgnoreCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String uI2 = userInput.toUpperCase();

        boolean uI3 = uI2.startsWith("J");

        System.out.println(uI3);

    }

}
