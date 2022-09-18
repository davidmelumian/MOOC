/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> changes;
    public ChangeHistory (){
        changes = new ArrayList<>();
    }
    public void add (double status){
        changes.add(status);
    }
    public void clear(){
        changes.clear();
    }
    public String toString (){
        return  String.valueOf(changes);
    }
    public double maxValue(){
        if (changes.isEmpty()){
            return 0;
        }
        double largest = changes.get(0);
        for (double var:changes){
            if (var>=largest){
                largest = var;
            }
        }
        return largest;
    }
    public double minValue(){
        if (changes.isEmpty()){
            return 0;
        }
        double smallest = changes.get(0);
        for (double var:changes){
            if (var<=smallest){
                smallest=var;
            }
        }
        return smallest;
    }
    public double average (){
        if (changes.isEmpty()){
            return 0;
        }
        double sum = 0.0;
        int count = 0;
        for (double var:changes){
            sum+=var;
            count ++;
        }
        return Math.round((sum/count) *100.00)/100.00;
    }
}
