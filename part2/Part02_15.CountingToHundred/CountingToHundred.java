
import java.util.Scanner;

public class CountingToHundred {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int terminate = 100;
        for (int i = input; i <= terminate; i++) {
            System.out.println(i);
        }
    }
}     
        /*   Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int terminate = 100;
        while (input <= terminate){
            System.out.println(input);
            input++;
        }
    }
} 
        */