
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(books,scanner);
        userInterface.start();

    }

}
