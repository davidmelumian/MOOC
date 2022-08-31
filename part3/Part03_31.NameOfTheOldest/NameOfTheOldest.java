
import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest= 0;
        String  oldestName = "";
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String [] names = input.split(",");
            int age = Integer.valueOf(names[1]);
            String  name = names[0];
            if (age> oldest){
                oldest =age;
                oldestName = name;
            }
        }
        System.out.println("The oldest " +  oldest);
        System.out.println("Name of the oldest: " + oldestName);
    }
}