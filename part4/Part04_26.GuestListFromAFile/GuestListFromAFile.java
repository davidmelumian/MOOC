
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        System.out.println("Name of the file:");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter the names,an empty line quits");
        try (Scanner scanner1 = new Scanner(Paths.get(filename))){
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                names.add(row);
            }

        } catch (Exception e ){
            System.out.println("Error: " + e.getMessage());
        }
        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            if (names.contains(input)){
                System.out.println("The name is on the list.");
                continue;
            }
            System.out.println("The name is not on the list");
        }
        System.out.println("Thank you!");
    }
}