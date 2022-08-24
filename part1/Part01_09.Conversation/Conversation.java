
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prints the message "Greetings! How are you doing?"
        System.out.println("Greetings! How are you doing?");
        
        //Evaluates  and store the user's input
        String answer1 = scanner.nextLine();
        
        //Prints the message "Oh, how interesting. Tell me more!"
        System.out.println("Oh, how interesting. Tell me more!");
        
        //Evaluates and store the user's input
        String answer2 = scanner.nextLine();
        
        //Prints the final message "Thanks for sharing!"
        System.out.println("Thanks for sharing!");
    }
}
