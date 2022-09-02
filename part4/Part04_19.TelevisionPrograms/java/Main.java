import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> list = new ArrayList<>();
        while (true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            if (programName.equals("")) {
                break;
            }
            System.out.print("Duration: ");
            int programDuration = Integer.valueOf(scanner.nextLine());
            list.add(new TelevisionProgram(programName,programDuration));
        }
        System.out.print("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram var : list) {
            if (var.getDuration()<=max)
                System.out.println(var);
        }
    }
}