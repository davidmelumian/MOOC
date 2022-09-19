import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Enter the numbers,\"end\" will stop the loop");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int value = Integer.valueOf(input);
            integers.add(value);
        }
        System.out.println(positive(integers));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> values = numbers.stream()
                .filter(var -> var > 0)
                .collect(Collectors.toList());
        return values;
    }
}
