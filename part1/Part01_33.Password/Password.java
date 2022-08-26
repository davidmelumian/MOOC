
import java.util.Scanner;

public class Password {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Password?");
        String  value = String.valueOf(reader.nextLine());
        if (value.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}