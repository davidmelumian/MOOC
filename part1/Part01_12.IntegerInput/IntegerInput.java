
import java.util.Scanner;

public class IntegerInput {

    public static void main (String [] args) {
        //Calls a scanner
        Scanner scanner= new Scanner(System.in);
        //prints the message
        System.out.println("Give a number:");
        // consumes the input as a string, converts it to a number
        int value = Integer.valueOf(scanner.nextLine());
        // displays the final result.
        System.out.println("You gave the number " + value);
    }
}
