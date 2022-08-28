
import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // запуск сканнера
        int count = 0; // декларирование переменной снаружи цикла, для доступности переменной снаружи.
        while (true) { //запуск цикла
            System.out.println("Give a number:"); // печать сообщения
            int num = Integer.valueOf(scanner.nextLine()); // декларирование переменной внутри цикла. Переменная доступна только внутри цикла.
            if (num == 0) {
                break;
            }
            if (num < 0) {
                count++;
            }
           
        }
        System.out.println("Number of negative numbers: " + count);
    }
}