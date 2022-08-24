
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        //Evaluates the user's input and store it in the memory.
        String message = scanner.nextLine();
        
        //Prints the user's input three times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        

    }
}
