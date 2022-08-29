
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// calling a scanner
        ArrayList<Integer> list = new ArrayList<>(); // creating a list.
        while (true){ //launching the infinitive loop
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0){
                break;
            }
            list.add (input);
          //  System.out.println("The list consist of : " + list); // debugging print
    }
        int second = list.get(1);
        int third  =list.get(2);
        int sum = second + third;
        System.out.println(sum);
}
}
