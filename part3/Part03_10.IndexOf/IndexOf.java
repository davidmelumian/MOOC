
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input== -1){
                break;
            }
            numbers.add(input);
            System.out.println(numbers);
        }
        System.out.print("Search for? ");
        int number = Integer.valueOf(scanner.nextLine());
        int size = numbers.size() -1;
        for (int i = 0; i<= size; i++){
            if (numbers.get(i)==number){
                System.out.println(number + " is at index " + i);
       
            }
        }

    }
}
