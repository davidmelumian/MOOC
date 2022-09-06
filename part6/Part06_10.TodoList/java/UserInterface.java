/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatiana
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList=todoList;
        this.scanner=scanner;
    }
    public void start(){
        while (true){
            System.out.print("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            if (input.equals("add")){
                this.add();
            }
            if (input.equals("list")){
                this.list();
            }
            if (input.equals("remove")){
                this.remove();
            }
        }
    }
    public void add (){
        System.out.print("To add :");
        String  input = scanner.nextLine();
        this.todoList.add(input);
    }
    public void list (){
        this.todoList.print();
    }
    public void remove(){
        System.out.print("Which one is removed?");
        int input = Integer.valueOf(scanner.nextLine());
       this. todoList.remove(input);
    }
}