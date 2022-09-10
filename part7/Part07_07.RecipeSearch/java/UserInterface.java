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
    private Recipes recipes;
    public UserInterface(Scanner scanner, Recipes recipes){
        this.scanner=scanner;
        this.recipes=recipes;
    }
    public void start(){
        System.out.print ("File to read: ");
        String input = scanner.nextLine();
        recipes.add(input);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            if (command.equals("list")){
                recipes.printRecipes();;
            }
            if (command.equals("find name")){
                System.out.print ("Searched word: ");
                String name = scanner.nextLine();
                recipes.printByName(name);
            }
            if (command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                recipes.printByTime(time);
            }
            if (command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipes.printByIngredient (ingredient);
            }
        }
    }
}