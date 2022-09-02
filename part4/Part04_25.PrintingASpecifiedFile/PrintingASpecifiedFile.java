
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        System.out.println("Which file should have its contents printed?");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

            try (Scanner scanner = new Scanner(Paths.get(input))) {
                while (scanner.hasNextLine()) {
                    String row = scanner.nextLine();
                    System.out.println(row);
                }
            } catch (Exception e) {
                System.out.println("The file " + e.getMessage() + " has not been found");
            }
    }
}
            
       
    

