
import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCurrent = 0;
        int firstMax = 100;
        int secondCurrent = 0;
        int secondMax = 100;
        while (true) {
            System.out.println("First: " + firstCurrent + "/" + firstMax);
            System.out.println("Second: " + secondCurrent + "/" + secondMax);
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            int number = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (number >= firstMax) {
                    firstCurrent = firstMax;
                } else if (number + firstCurrent>firstMax) {
                    firstCurrent = firstMax;
                } else if (number > 0 && number < firstMax) {
                    firstCurrent += number;
                } else {
                    return;
                }
            }
            if (command.equals("move")) {
                if (number<=0){
                    continue;
                }
                if (number> firstCurrent && firstCurrent + secondCurrent<= secondMax){
                    secondCurrent += firstCurrent;
                    firstCurrent -= firstCurrent;
                    continue;
                }
                if (number<=firstCurrent && firstCurrent + secondCurrent <= secondMax){
                    secondCurrent+= number;
                    firstCurrent-= number;
                    continue;
                }

                if (number> firstCurrent && firstCurrent + secondCurrent>secondMax){
                    secondCurrent = secondMax;
                    firstCurrent -= firstCurrent;
                    continue;
                }
                if (number<firstCurrent && firstCurrent + secondCurrent > secondMax){
                    secondCurrent= secondMax;
                    firstCurrent-= number;
                }
            }
            if (command.equals("remove")){
                if (number<=0){
                    continue;
                } else if (number>=secondCurrent){
                    secondCurrent-=secondCurrent;
                } else {
                    secondCurrent-= number;
                }
            }
        }
    }
}