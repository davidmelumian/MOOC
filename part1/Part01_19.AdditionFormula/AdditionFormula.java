
import java.util.Scanner;

public class AdditionFormula {

  public static void main(String[] args){
        // calls the scanner
        Scanner scanner = new Scanner(System.in);
        //prints the first message
        System.out.println("Give the first number:");
        //String -> Integer
        int n1 =Integer.valueOf( scanner.nextLine());
        // prints the second message
        System.out.println("Give the second number:");
        //String -> Integer
        int n2 = Integer.valueOf(scanner.nextLine());
        // prints the final message
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));


    }
}