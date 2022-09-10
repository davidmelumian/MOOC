/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
import java.util.ArrayList;

public class Recipe {
    private String  name;
    private int  cookTime;
    private ArrayList<String> ingredients;
    public Recipe(){
        this.ingredients=new ArrayList<>();
    }
    public String getName(){
        return name;
    }

    public int getCookTime() {
        return cookTime;
    }
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    public Recipe add(ArrayList<String> recipe){
        name=recipe.get(0);
        cookTime=Integer.valueOf( recipe.get(1));
        for (int i = 2; i<recipe.size(); i++){
            ingredients.add( recipe.get(i));
        }
        return this;
    }

    @Override
    public String toString() {
        return this.name +", cooking time: " + this.cookTime;
    }
    public boolean isIn (String ingredient){
        for (int i=0; i<this.ingredients.size(); i++){
            if (this.ingredients.get(i).equals(ingredient)){
                return true;
            }
        }
        return  false;
    }
}