
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        System.out.println("Name of the file:");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        ArrayList<String> names = new ArrayList<>();
        try (Scanner scanner1 = new Scanner(Paths.get(filename))){
            while (scanner1.hasNextLine()){
                names.add(scanner1.nextLine());
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage()  + " failed.");
            
        }
        System.out.println("Search for:");
        String  input = scanner.nextLine();
        if (names.contains(input)){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}