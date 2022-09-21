/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private List<Book> books;
    private Scanner scanner;

    public UserInterface(List<Book> books, Scanner scanner) {
        this.books = books;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation:");
            String age = scanner.nextLine();
            books.add(new Book(input, Integer.valueOf(age)));
        }
        count();
        var();
        printBooks();
    }
        public void count(){
        long result = books.stream().count();
        System.out.println(result + " books in total.");
    }

    public void printBooks() {
        books.stream()
                .forEach(var -> System.out.println(var));
    }

    public Comparator var() {
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        return comparator;
    }
}
