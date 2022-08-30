
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            numbers.add(input);
            System.out.println(numbers);
        }
        int sum = 0;
        for (int read : numbers){
            sum += read;
            System.out.println("The current sum: "+ sum);
        }
        System.out.println(sum);
    }
}
