
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        //calls a scanner for capture user's input
        Scanner scanner = new Scanner(System.in);

        //prints the first message 
        System.out.println("I will tell you a story, but I need some information first.");
        // prints the second message
        System.out.println("What is the main character called?");
        //Evaluates the user's input and store it
        String input1 = scanner.nextLine();
        //prints the third message
        System.out.println("What is their job?");
        //Evaluates the user's input and store it
        String input2 = scanner.nextLine();
        //Prints the fourth message
        System.out.println("Here is the story:");
        //Prints the fifth message, inclund the first and second input
        System.out.println("Once upon a time there was " +input1 + "," + " who was " +input2 + ".");
        // Prints the sixth message,with the first input 
        System.out.println("On the way to work, " +input1 + " reflected on life.");
        // prints the final message. with the first and second input
        System.out.println("Perhaps " +input1 + " will not be " +input2 + " forever.");
    }
}
