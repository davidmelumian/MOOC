
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int count = 0;
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String [] namesAndDates = input.split(",");
            sum+=Integer.valueOf(namesAndDates[1]);
            count ++;
            int stringLength = Integer.valueOf(namesAndDates[0].length());
            String name = namesAndDates[0];
            if (stringLength > longestName.length()){
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName );
        System.out.println("Average of the birth years: " + (1.0*sum/count));
    }
}