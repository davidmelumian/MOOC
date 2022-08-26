
import java.util.Scanner;

public class Adulthood {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);//calls the scanner
        System.out.println("How old are you?");// prints the message
        int age = Integer.valueOf(scanner.nextLine());// String -> Integer
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
