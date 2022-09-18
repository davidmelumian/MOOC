/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String,Item> itemMap;
    public ShoppingCart(){
        this.itemMap=new HashMap<>();
    }
    public void add(String product, int price){
        if (itemMap.containsKey(product)){
            itemMap.get(product).increaseQuantity();
            return;
        }
        itemMap.put(product,new Item(product,1,price));
    }
    public int price (){
        int sum = 0;
        for (String var:itemMap.keySet()){
           sum+= itemMap.get(var).price();
        }
        return sum;
    }
    public void print(){
        for(String var:itemMap.keySet()){
            System.out.println(var + ": " + itemMap.get(var).getQty());
        }
    }

}