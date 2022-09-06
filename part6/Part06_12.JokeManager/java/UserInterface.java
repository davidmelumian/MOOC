/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                addJokeUI();
            }
            if (command.equals("2")){
                drawJokesUI();
            }
            if (command.equals("3")){
                printJokesUI();
            }
        }
    }
    public void addJokeUI(){
        System.out.println("Write the joke to be added: ");
        String aJoke = scanner.nextLine();
        jokeManager.addJoke(aJoke);
    }
    public void drawJokesUI (){
        System.out.println("Drawing Jokes:");
        System.out.println( jokeManager.drawJoke());
    }
    public void printJokesUI(){
        System.out.println("Printing jokes.");
        jokeManager.printJokes();
    }
}