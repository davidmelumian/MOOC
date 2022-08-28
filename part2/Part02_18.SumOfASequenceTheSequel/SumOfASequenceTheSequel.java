
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number? ");
        int second = Integer.valueOf(scanner.nextLine());
        int result = 0;
        for (int i = first; i<= second; i++){
            result += first;
            first += 1;
        }
        System.out.println("The sum is: " + result);
    }
}
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number?");
        int first =Integer.valueOf(scanner.nextLine());
        System.out.print("Second number?");
        int second =Integer.valueOf(scanner.nextLine());
        int result = 0;
        while (first <= second){
            result += first;
            first++;
        }
        System.out.println("The sum is: " +result);
    }
}
*/