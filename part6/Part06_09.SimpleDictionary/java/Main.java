
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary s= new SimpleDictionary();
        TextUI t = new TextUI(scanner,s);
        t.start();
    }
}