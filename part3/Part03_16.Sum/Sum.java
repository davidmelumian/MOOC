import java.util.Scanner;
import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        System.out.println("The sum: " + sum(numbers()));


    }
    public static ArrayList<Integer> numbers (){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input==0){
                break;
            }
            numbers.add(input);
            System.out.println("The element " + input + " was added to the list.");
            System.out.println("The list consist of " + numbers);

        }
        return numbers;
    }
    public static int sum (ArrayList<Integer> aname){
        int sum = 0;
        for (int number: aname){
            sum += number;
        }
        return sum;
    }
}
