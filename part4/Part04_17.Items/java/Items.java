
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            items.add(new Item(input));

        }
        for(Item item:items){
            System.out.println(item);
        }
    }
}