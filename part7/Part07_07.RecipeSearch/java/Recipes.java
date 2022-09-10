/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipes {
    private ArrayList<Recipe> lor ;
    public Recipes (){
        this.lor=new ArrayList<>();
    }
    public Recipes add(String fileName){
        try (Scanner scanner = new Scanner(Paths.get(fileName))){
            while (scanner.hasNextLine()){
                ArrayList<String> accumulator = new ArrayList<>();
                Recipe recipe = new Recipe();
                while(scanner.hasNextLine()){
                    String row =scanner.nextLine();
                    if (row.isEmpty()){
                        break;
                    }
                    accumulator.add(row);
                }
                recipe.add(accumulator);
                this.lor.add(recipe);
            }
        } catch (Exception e){
            System.out.println("Error "+ e.getMessage());
        }
        return this;
    }
    public void printRecipes (){
        System.out.println("Recipes:");
        for (int i=0; i<this.lor.size(); i++){
            System.out.println( this.lor.get(i));
        }
    }
    public void printByName(String search){
        for (int i = 0; i<this.lor.size(); i++){
            if (this.lor.get(i).getName().contains(search)){
                System.out.println(this.lor.get(i));
            }
        }
    }
    public void printByTime(int time){
        for (int i = 0; i<this.lor.size();i++){
            if (this.lor.get(i).getCookTime()<=time){
                System.out.println(this.lor.get(i));
            }
        }
    }
    public void printByIngredient(String ingredient){
        for (int i = 0; i<this.lor.size();i++){
            if (this.lor.get(i).isIn(ingredient)){
                System.out.println(this.lor.get(i));
            }
        }
    }
}
