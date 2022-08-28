
import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = Integer.valueOf(scanner.nextLine());
        int to = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(from,to);
    }
    public static void  divisibleByThreeInRange(int x, int y){
        while(x<=y){
            if (x%3==0){
                System.out.println(x);
            }
            x++;
        }
    }
}