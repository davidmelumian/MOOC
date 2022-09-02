import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        while (true){
            System.out.print("Title: ");
            String  bookTitle = scanner.nextLine();
            if (bookTitle.equals("")){
                break;
            }
            System.out.print("Pages: ");
            int  bookPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication Year: ");
            int  bookYear = Integer.valueOf(scanner.nextLine());
            Book example = new Book(bookTitle,bookPages,bookYear);
            list.add(new Book(bookTitle,bookPages,bookYear));

           // System.out.println(example + " has been added to the list ");
        }
        System.out.print("What information will be printed? ");
        String filter = scanner.nextLine();
        if (filter.equals("everything")){
            for (Book var:list){
                System.out.println(var);
            }
        } else if (filter.equals("name")) {
            for (int i = 0; i <list.size(); i++){
                System.out.println(list.get(i).getName());
            }
        } else {
            System.out.println("Unknown filter.There are  everything or name");
        }
    }
}
