
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number?");
        int input =Integer.valueOf(scanner.nextLine());
        int result = 0;
        for (int i = 1; i<= input; i++){
            result += i;
        }
        System.out.println("The sum is " +result);
    }
}
/* solution with while condition
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number?");
        int input =Integer.valueOf(scanner.nextLine());
        int result = 0;
        int count = 1;
        while (count <= input){
            result += count;
            count++;
        }
        System.out.println("The sum is " +result);
    }
}
*/
    