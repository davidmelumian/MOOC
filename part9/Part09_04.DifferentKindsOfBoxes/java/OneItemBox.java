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

public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> items;
    public OneItemBox(){
        this.capacity=1;
        this.items=new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.capacity>0){
            this.capacity-=1;
            items.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        for (Item var: items){
            if (var.equals(item)){
                return true;
            }
        }
        return false;
    }

}