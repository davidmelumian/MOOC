
import java.util.Scanner;

public class GradesAndPoints {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grade points [0-100]:");
        int grade = Integer.valueOf( scanner.nextLine());
        if (grade < 0 ) {
            System.out.println("Impossible!");
        } else if (grade <= 49) {
            System.out.println("failed");
        } else if (50<=grade&&grade<=59) {
            System.out.println("1");
        } else if (60<=grade&&grade<=69) {
            System.out.println("2");
        } else if (70<=grade&&grade<=79) {
            System.out.println("3");
        } else if (80<=grade&&grade<=89){
            System.out.println("4");
        } else if (90<=grade&&grade<=100) {
            System.out.println("5");
        } else {
            System.out.println("Incredible!");
        }
    }
}