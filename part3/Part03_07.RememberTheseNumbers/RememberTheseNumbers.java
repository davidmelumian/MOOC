
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// вызов сканнера
        ArrayList<Integer> list = new ArrayList<>();// создание списка
        while (true) {// запуск бесконечнего цикла. -1 - это терминейт аргумент
            int input = Integer.valueOf(scanner.nextLine()); // считывание инпута, String -> Integer
            if (input== -1){
                break; // выход из  цикла, при условии, что получен аргумент -1
            }
            list.add(input);// добавление значений в список
            System.out.println(list); // отображение из каких значений состоит список. обновляется каждый раз вместе с циклом.
        }
        int size = list.size()-1; // определение сколько элементов находится в списке. минусуем 1 для корректной индексации
        for (int i = 0; i<=size; i++){
            System.out.println(list.get(i));
        }
    }
}