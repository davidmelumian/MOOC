import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) {
        // мы говорим что в этом условии может произойти исключение
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            //запуск цикла
            while (scanner.hasNextLine()) {//условие для входа в цикл
                String row = scanner.nextLine();// чтение одной линий
                System.out.println(row); // печать линии
            }
        } catch (Exception e){// мы говорим программе, что делать, если случилось исключение. в данном случае, если файл не найден.
            System.out.println("Error: " + e.getMessage());
        }


    }
}