
import java.util.Scanner;

public class GiftTax {

    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double value = Integer.valueOf(scanner.nextLine());
        double rate8 = 100 + (value - 5000)*0.08;
        double rate10 = 1700 + (value - 25000)*0.10;
        double rate12 = 4700 + (value - 55000)*0.12;
        double rate15 = 22100 + (value - 200000)*0.15;
        double rate17 = 142100 +(value - 1000000)*0.17;
        if (value<5000) {
            System.out.println("No tax!");
        } else  if (5000<=value && value<25000){
            System.out.println("Tax: " +rate8);
        } else if (25000<=value && value<55000) {
            System.out.println("Tax: " +rate10);
        } else if (55000<=value && value<200000){
            System.out.println("Tax: " +rate12);
        } else if (200000<=value && value<1000000){
            System.out.println("Tax: " +rate15);
        } else {
            System.out.println("Tax: " +rate17);
        }
    }
}

