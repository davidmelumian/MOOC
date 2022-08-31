
import java.util.Scanner;

public class AgeOfTheOldest {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int older = 0;

        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[]separate =input.split(",");
            int age = (Integer.valueOf(separate[1]));
            if (age>older){
                older=age;
        }

        }
        System.out.println("Age of the oldest: " + older);
    }

      
}
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[]separate =input.split(",");
            numbers.add(Integer.valueOf(separate[1]));
        }
        int older = numbers.get(0);
        for (int i = 0; i<numbers.size(); i++ ){
            int number = numbers.get(i);
            if (older< number){
                older=number;
            }
        }
        System.out.println("Age of the oldest: " + older);
    }

}
*/
