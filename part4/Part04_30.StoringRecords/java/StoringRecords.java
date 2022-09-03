
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // вызов сканнера

        System.out.println("Filename:"); // печать сообщения
        String file = scan.nextLine(); // считывание инпута

        ArrayList<Person> records = readRecordsFromFile(file); // создание обьекта.
        System.out.println("Persons: " + records.size());// печать количества значений в списке
        System.out.println("Persons:"); // печать сообщение
        for (Person person : records) { // печать списка.
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) { // метод который возвращает список. метод поглощает файл
        ArrayList<Person> persons = new ArrayList<>(); // создание обьекта persons
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String [] person= line.split(",");
                String  name = person[0];
                int age = Integer.valueOf(person[1]);
                persons.add(new Person(name,age));
            }
        } catch (Exception e){
            System.out.println("File " + e.getMessage() + " was not found.");
        }

        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}