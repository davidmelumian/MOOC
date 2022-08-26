
import java.util.Scanner;

public class Positivity {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);// calls the scanner
        System.out.println("Give a number:");// prints the message
        int number = Integer.valueOf(scanner.nextLine());// String -> Integer
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}