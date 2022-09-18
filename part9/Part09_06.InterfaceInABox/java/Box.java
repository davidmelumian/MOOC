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

public class Box implements Packable {
    private double maximumCapacity;
    private ArrayList<Packable> items;
    public Box (double maximumCapacity){
        this.maximumCapacity=maximumCapacity;
        this.items=new ArrayList<>();
    }

    public double getCapacity() {
        return maximumCapacity;
    }

    public void add(Packable item){
        if (weight()+ item.weight() < this.maximumCapacity){
            items.add(item);
        }
    }
    public double weight (){
        double sum=0.0;
        for (Packable var:items){
            sum+=var.weight();
        }
        return Math.round( sum*100.00)/100.00;
    }
    @Override
    public  String toString(){
        return  "Box: " + items.size() +" items, total weight " + weight() + " kg";
    }

}
