import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            numbers.add(input);
            System.out.println("The element " + input + " was added to the list.");
            System.out.println("The list consist of: " + numbers);
        }
        System.out.print("From?" );
        int from = Integer.valueOf(scanner.nextLine());
        System.out.print("To?" );
        int to = Integer.valueOf(scanner.nextLine());
        printNumbersInRange(numbers,from,to);

    }public static void printNumbersInRange (ArrayList<Integer> aName,int lowerLimit , int upperLimit){
        for (int list: aName){
            if (lowerLimit<= list && list<= upperLimit){
                System.out.println(list);
            }

        }
    }
}