
import java.util.Scanner;

public class Orwell {
    public static void main (String [] args){
        // calls the scanner
        Scanner scanner = new Scanner(System.in);
        // prints the message "Give a number"
        System.out.println("Give a number:");
        // evaluates the user's input
        int number =Integer.valueOf( scanner.nextLine());
        // Int Int -> Boolean
        if (number==1984){
            System.out.println("Orwell");
        }

    }
}
