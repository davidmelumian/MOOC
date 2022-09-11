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
    private  TodoList list;
    private Scanner scanner;
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            if (input.equals("add")){
                System.out.print("To add: ");
                String addWhat = scanner.nextLine();
                this.list.add(addWhat);
            }
            if (input.equals("list")){
                this.list.print();
            }
            if (input.equals("remove")){
                System.out.print("Which one is removed? ");
                int numberToRemove  = Integer.valueOf(scanner.nextLine());
                this.list.remove(numberToRemove);
            }
        }
    }
}
