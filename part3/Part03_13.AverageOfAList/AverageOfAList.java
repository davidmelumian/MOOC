
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int input= Integer.valueOf(scanner.nextLine());
            if (input == -1 ){
                break;
            }
            numbers.add(input);
            System.out.println(numbers);
        }
        int count = 0;
        int size = numbers.size();
        int sum  = 0;
        while ( count < size) {
            sum += numbers.get(count);
            count++;
        }
        double average = 1.0*sum/size;
        System.out.println("Average: " +average);
    }
}