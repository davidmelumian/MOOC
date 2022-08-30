
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveLast {
    public static void main(String[] args){
        removeLast(createList());

    }
    public static ArrayList<String> createList (){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true){
            String input =scanner.nextLine();
            if (input.equals("")){
                break;
            }
            names.add(input);
            System.out.println("The element " + input + " was added to the list.");
            System.out.println("The list consist of: " + names);
        }
        return names;
    }
    public static void removeLast (ArrayList<String> strings){
        int indexLast = strings.size()-1;
        if (strings.size() == 0){
            return;
        }
        System.out.println("The element " + strings.get(indexLast) + " was removed from the list");
        strings.remove(indexLast);
        System.out.println("The list consist of: " +strings);
    }
}