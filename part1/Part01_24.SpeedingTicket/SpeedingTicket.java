
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        // calls the scanner
        Scanner scanner = new Scanner(System.in);
        // prints the "give speed" message
        System.out.println("Give  speed:");
        //String -> Integer
        int value = Integer.valueOf(scanner.nextLine());

        // Integer Integer -> Boolean
        if (value > 120) {
            System.out.println("Speeding ticket!");

        }
    }
}
