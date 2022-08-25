
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        // calls the scanner
        Scanner scanner = new Scanner(System.in);
        // prints " Give the first number "
        System.out.println("Give the first number:");
        //String -> Integer
        int dividend = Integer.valueOf( scanner.nextLine());
        //prints "Give the second number"
        System.out.println("Give the second number:");
        //String -> Integer
        int divisor = Integer.valueOf(scanner.nextLine());
        // Declares double type and makes one of the operand decimal,prior to executing the division,  in order to avoid imprecise
        double result = (double) (dividend+divisor)/2;
        // prints the result
        System.out.println("The average is " + result);
    }
}
