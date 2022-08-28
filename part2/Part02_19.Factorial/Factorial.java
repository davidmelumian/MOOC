
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        int result = 1;
        for (int i = 1; i <= input; i++){
            result *=i;
        }
        System.out.println("Factorial: " + result);
    }
}
        /* solution with while condition
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int count = 0;
        int result = 1;
        while (count < number){
            count ++;
            result *= count;
        }
        System.out.println("Factorial: " + result);
    }
}
*/