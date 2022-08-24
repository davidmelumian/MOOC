
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prints the message "What's your name?"
        System.out.println("What's your name?");
        
        //Evaluates the user input and store it in the memory
        String input = scanner.nextLine();
        
        //Prints the "hi" and user's input
        System.out.println("Hi" + " " + input);

    }
}
