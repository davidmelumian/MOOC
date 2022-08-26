
import java.util.Scanner;

public class Ancient {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);// calls the scanner
        System.out.println("Give a year: ");// prints the year message
        int year = Integer.valueOf(scanner.nextLine());//String -> Integer
        System.out.println("");
        if (year<2015){
            System.out.println("Ancient history!");
        }
    }
}

