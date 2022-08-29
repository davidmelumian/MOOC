
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int input  = Integer.valueOf(scanner.nextLine());
            if (input== -1){
                break;
            }
            numbers.add(input);
           // System.out.println(numbers);
        }
        int size = numbers.size()-1;
       // System.out.println(size);
        System.out.print("From where?");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.print("To where?");
        int input2 = Integer.valueOf(scanner.nextLine());
        for (int i = input; i<=input2; i++){
            System.out.println(numbers.get(i));
        }
    }
}
