
import java.util.Scanner;

public class SumOfTwoNumbers {
   public static void main(String[] args) {
        // calls the scanner
        Scanner scanner = new Scanner(System.in);
        // prints "Give the first number"
        System.out.println("Give the first number:");
        //String -> integer
        int n1 = Integer.valueOf(scanner.nextLine());
        // prints "Give the second number"
        System.out.println("Give the second number:");
        // String -> Integer
        int n2 = Integer.valueOf(scanner.nextLine());
        // prints the sum of the first and second numbers
        System.out.println("The sum of the numbers is " + (n1 + n2 ));

    }
}
