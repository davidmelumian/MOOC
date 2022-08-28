
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in); // вызов сканнера
        System.out.println("How many times?"); // печать сообщения
        int input = Integer.valueOf(scanner.nextLine()); // Прием инпута, конвертация в целое число и передача значения в условия входа в цикл
        for (int i = 0; i < input; i++){
            printText();
        }
    }
    public static void printText (){// вызов метода. метод имеет дефолтные кейворды,без аргументов. в теле методе пишем принт
        System.out.println("In a hole in the ground there lived a method");
    }
}
