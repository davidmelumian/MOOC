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
public class Hold {
    private ArrayList<Suitcase> luggage;
    private int maxWeight;

    public Hold (int maxWeight){
        this.luggage = new ArrayList<>();
        this.maxWeight=maxWeight;
    }

    public int weightOfSuitcases (){
        int weight = 0;
        for(Suitcase var:luggage){
            weight+=var.totalWeight();
        }
        return weight;
    }
    public void addSuitcase(Suitcase suitcase){

        if (weightOfSuitcases()+suitcase.totalWeight()<=maxWeight){
            luggage.add(suitcase);
        }
    }
    public String toString (){
        int size =this.luggage.size();
        return size + " suitcases (" + weightOfSuitcases() + "kg)";
    }
    public void printItems(){
        for (Suitcase var:luggage){
            var.printItems();
        }
    }
}