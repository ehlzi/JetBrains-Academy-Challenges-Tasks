import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        
        int num1 = scanner.nextInt(); //2
        int num2 = scanner.nextInt(); //7
        int num3 = scanner.nextInt(); //9
        
        System.out.println((num1 >= num2) && (num1 <= num3));
        
    }
}