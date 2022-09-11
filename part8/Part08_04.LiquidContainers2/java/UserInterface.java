/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private Container first;
    private Container second;

    public UserInterface(Scanner scanner, Container first, Container second) {
        this.scanner = scanner;
        this.first = first;
        this.second = second;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                first.add(amount);
            }
            if (command.equals("move")) {
                if (first.contains() <= amount) {
                    second.add(first.contains());
                    first.remove(first.contains());
                }
                if (first.contains()>amount){
                    second.add(amount);
                    first.remove(amount);
                }
            }
            if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
