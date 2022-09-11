
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        int sum = 0;
        int count = 0;

        for (int var : numbers) {
            if (var > 0) {
                sum += var;
                count++;
            }
        }
        if (sum > 0) {
            double result = sum * 1.0 / count;
            System.out.println(result);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
