
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File? ");
        String fileName = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count =0;
        try (Scanner scanner1 = new Scanner(Paths.get(fileName))){
            while (scanner1.hasNextLine()){
                int line  = Integer.valueOf(scanner1.nextLine());
                System.out.println(line);
                if (! (line>=lowerBound && line<=upperBound )){
                    continue;
                }
                count++;
            }
        } catch (Exception e){
            e.getMessage();
        }
        System.out.println("Numbers: " +  count);
    }
}