import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics even =  new Statistics();
        Statistics odd = new Statistics();
        while (true){
            System.out.println("Enter numbers:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            if (input % 2 == 0){
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
            statistics.addNumber(input);
            System.out.println("The number " + input  + " was added to the statistics");
        }
        System.out.println(statistics);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("--------------------------------------");
        System.out.println("Sum of even numbers: " + even.sum() );
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
