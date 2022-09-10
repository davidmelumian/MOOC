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
    private Scanner scanner;
    private ListOfBirds list;
    public UserInterface (Scanner scanner, ListOfBirds list){
        this.scanner=scanner;
        this.list=list;
    }
    public void start(){
        while (true){
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Quit")){
                break;
            }
            if (input.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();
                list.add(name,nameLatin);
            }
            if (input.equals("Observation")){
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                list.check(name);
            }
            if (input.equals("All")){
                list.printBirds();
            }
            if (input.equals("One")){
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                list.printOneBird(name);
            }
        }
    }


}
