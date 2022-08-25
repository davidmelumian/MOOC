
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
                //Calls the scanner
        Scanner scanner= new Scanner(System.in);
        //prints the "Give a number:"
        System.out.println("Give a number:");
        //consumes the user's input, and converts it from string to double
        double value = (Double.valueOf(scanner.nextLine()));
        //prints the "You gave the number" and user's input
        System.out.println("You gave the number " + value);
    }
}
