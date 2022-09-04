
import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals; // декларирование типа ссылочной переменной
    public Menu (){ // в параметрах конструктора ничего нет
        this.meals = new ArrayList<>(); // тело конструктора.
    }
    public void addMeal (String meal) {
        if (this.meals.contains(meal)){
            System.out.println("The " + meal + " is already on the list. ");
            return;
        }
        this.meals.add(meal);
    }
    public void clearMenu (){
        for (int i = meals.size()-1; i>=0; i--){
            meals.remove(i);
            // or use a primitive method
            //this.meals.clear();
        }
    }
    public void printMeals (){
        for (String var:this.meals){
            System.out.println(var);
        }
    }
}