
import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи имя автора:");
        String author = scanner.nextLine();
        System.out.println("Введи название книги:");
        String title = scanner.nextLine();
        System.out.println("Введи количество страниц:");
        int pages = Integer.valueOf(scanner.nextLine());
        Book book = new Book(author,title,pages);
        System.out.println(book);
    }
}
