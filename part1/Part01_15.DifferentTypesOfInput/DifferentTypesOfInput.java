
import java.util.Scanner;

public class DifferentTypesOfInput {

        public static void main (String [] args) {
        //calls a scanner.
        Scanner scanner= new Scanner(System.in);
        //prints "Give a string:"
        System.out.println("Give a string:");
        //declares the type, creates a variable and consumes a user's input as a value
        String sval=scanner.nextLine();
        //prints "Give an integer:"
        System.out.println("Give an integer:");
        //declares the type, creates a variable and consumes a user's input as a value
        int ival =Integer.valueOf( scanner.nextLine());
        //prints "Give a double:"
        System.out.println("Give a double:");
        //declares the type, creates a variable and consumes a user's input as a value
        double dval = Double.valueOf(scanner.nextLine());
        //prints "Give a boolean:"
        System.out.println("Give a boolean:");
        //declares the type, creates a variable and consumes a user's input as a value
        boolean bval = Boolean.valueOf(scanner.nextLine());
        // prints the given values
        System.out.println("You gave the string " + sval);
        System.out.println("You gave the integer " +ival);
        System.out.println("You gave the double " +dval);
        System.out.println("You gave the boolean " + bval);



    }
}
