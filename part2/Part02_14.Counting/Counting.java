
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // calls the scanner
        int count = 0; //  counts the number of iterations of the loop
        int input =Integer.valueOf(scanner.nextLine());// Reads the user's input, convert the value String -> Integer.
        for (int i = count; i <= input; i++){
            System.out.println(i);
        }
    }
}
        /*   solution by using while with condition
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int count = 0;
        while (count <= input){
            System.out.println(count);
            count++;
        }
    }
}
         */