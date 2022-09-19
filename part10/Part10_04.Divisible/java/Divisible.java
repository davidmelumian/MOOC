
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Enter the numbers,\"end\" will stop the loop.");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            int value = Integer.valueOf(input);
            integers.add(value);
        }
        divisible(integers).stream()
                .forEach(num->System.out.println(num));

    }
    public static ArrayList<Integer> divisible (ArrayList<Integer> numbers){
        return numbers.stream().filter(var->var%2==0|| var%3==0 || var%5==0).collect(Collectors.toCollection(ArrayList::new));
    }

}