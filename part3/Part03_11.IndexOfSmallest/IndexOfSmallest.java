
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            numbers.add(input);
            System.out.println(numbers);
        }
        int size = numbers.size() - 1;
        int smallest = numbers.get(0);
        for (int i = 0; i <= size; i++) {
            int number = numbers.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        int search = smallest;
        for (int i = 0; i <= size; i++) {
            if (numbers.get(i) == search) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}