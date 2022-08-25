
import java.util.Scanner;

public class SecondsInADay {

       public static  void main (String [] args){
        //calls a scanner
        Scanner scanner = new Scanner(System.in);
        //prints the message "Give the number of days"
        System.out.println("How many days would you like to convert to seconds? ");
        //String -> Integer
        int days = Integer.valueOf(scanner.nextLine());
        //Integer Integer -> Integer
        // counts the seconds in the given number of days
        // 1 minute = 60 sec
        // 1 hour = 3600 sec
        // 24 hour = 86 400 sec
        int seconds = 86400;
        int secondsInDay = days*seconds;
        //Prints the result
        System.out.println(secondsInDay);

    }
}
