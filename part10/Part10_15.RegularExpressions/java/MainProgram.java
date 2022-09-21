
import java.util.Scanner;
public class MainProgram {

    public static void main(String[] args) {
           Scanner scanner  =new Scanner(System.in);
        Checker checker = new Checker();
        while(true) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            if (checker.timeOfDay(input)) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }
        }
    }

}