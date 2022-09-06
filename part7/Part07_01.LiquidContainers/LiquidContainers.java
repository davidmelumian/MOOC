
import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int max = 100;
        while (true) {
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (parts[0].equals("quit")){
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                if (amount < 0) {
                    continue;
                } else if (amount + first > 100) {
                    first = 100;
                } else {
                    first += amount;
                }
            }
            if (parts[0].equals("move")){
                if (amount<0){
                    continue;
                }

                if (second+first>100){
                    second = 100;
                    first-= first;
                    continue;
                }
                if (first>= amount){
                    second+=amount;
                    first-= amount;
                    continue;
                }

                if (first<amount){
                    second+= first;
                    first -= first;
                    continue;
                }
               
            }
            if (parts[0].equals("remove")){
                if (amount<0){
                    continue;
                }
                if (second<amount){
                    second -= second;
                }
                if (second>amount){
                    second -= amount;
                }
            }


        }
    }
}
