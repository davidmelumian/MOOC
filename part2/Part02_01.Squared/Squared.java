
import java.util.Scanner;

public class Squared {

    public static void main (String [] args) {
        Scanner read = new Scanner(System.in);//calls the scanner
        int value = Integer.valueOf(read.nextLine());//reads the users input and convert it from a string to a integer
        int square = value*value;// identifying the operation and declaring a variable for the result
        System.out.println(square);// prints the result of the operation
    }
}
