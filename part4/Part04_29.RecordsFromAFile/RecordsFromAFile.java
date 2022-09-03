import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        String  year = "";
        try (Scanner fileReader = new Scanner(Paths.get(fileName))){
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String []parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                if (age == 1){
                    year= (" year");
                } else {
                    year = (" years");
                }
                System.out.println(name + ", age: " + age + year);
            }
        } catch (Exception e){
            System.out.println("File " + fileName + " was not found");
        }
    }
}
