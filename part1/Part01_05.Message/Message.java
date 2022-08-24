
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        //calls a Scanner, tool that consumes user's input
        Scanner scanner = new Scanner(System.in);

        // prints the message "Write a message"
        System.out.println("Write a message:");
        
        // Evaluates  the user input's and add it to the program memory
        // we choose the method nextline, because it consumes an entire line
        String message = scanner.nextLine();
        
        //Retrieves the user's input from a program's memory and then print it
        System.out.println(message);
    }
}
