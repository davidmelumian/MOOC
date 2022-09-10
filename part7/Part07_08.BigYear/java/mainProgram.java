
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListOfBirds list = new ListOfBirds();
        UserInterface userInterface = new UserInterface(scanner,list);
        userInterface.start();

    }

}
