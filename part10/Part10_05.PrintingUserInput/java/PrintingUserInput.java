
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        while (true){
            String theinput = scanner.nextLine();
            if (theinput.equals("")){
                break;
            }
            input.add(theinput);
        }
        input.stream()
                .forEach(var -> System.out.println(var));
    }
}
