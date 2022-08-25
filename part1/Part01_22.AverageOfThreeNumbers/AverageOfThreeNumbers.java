
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        // calls the scanner
        Scanner scanner = new Scanner(System.in);
        // prints " Give the first number "
        System.out.println("Give the first number:");
        //String -> Integer
        int num1 = Integer.valueOf( scanner.nextLine());
        //prints "Give the second number"
        System.out.println("Give the second number:");
        //String -> Integer
        int num2 = Integer.valueOf(scanner.nextLine());
        //prints "Give the third number"
        System.out.println("Give the third number:");
        // String -> Integer
        int num3 = Integer.valueOf(scanner.nextLine());

        // Declares double type and makes one of the operand decimal,prior to executing the division,  in order to avoid imprecise
        double result = (num1+num2+num3)/ (double) 3;
        // prints the result
        System.out.println("The average is " + result);
    }
}
