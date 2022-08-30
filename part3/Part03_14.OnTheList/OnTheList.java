
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            names.add(input);
            System.out.println("The element " + input  + " was added to the list.");
            System.out.println("The list consist of : " + names);
        }
        System.out.print("Search for? ");
        String input = scanner.nextLine();
        if (names.contains(input)){
            System.out.println(input + " was found!");
        }
        else {
            System.out.println(input + " was not found!");
        }
    }
}
