
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);// calls the scanner
        System.out.println("Give the first number:");// prints the first message
        int num1 = Integer.valueOf(scanner.nextLine());// String -> integer
        System.out.println("Give the second number:");// prints the second message
        int num2 = Integer.valueOf(scanner.nextLine());// String -> Integer
        System.out.println(num1+ " + " +num2 +" = " + (num1 + num2));
        System.out.println(num1+ " - " +num2 +" = " + (num1 - num2));
        System.out.println(num1+ " * " +num2 +" = " + (num1 * num2));
        System.out.println(num1+ " / " +num2 +" = " + ((1.0 * num1) / num2));
    }
}