
import java.util.Scanner;

public class BooleanInput {

        public static void main (String []args){
        //calls the scanner
        Scanner scan = new Scanner(System.in);
        //Prints the "Write something:"
        System.out.println("Write something:");
        //consumes the user' input and convert it to a boolean.
        // all strings expect true are false
        boolean val = Boolean.valueOf(scan.nextLine());
        //Prints the "True or false? and users input
        System.out.println("True or false? " + val);
    }
}
