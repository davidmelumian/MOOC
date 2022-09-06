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

public class Suitcase {
   private ArrayList<Item> items ;
   private int maxWeight;
   public Suitcase(int maxWeight){
       this.items=new ArrayList<>();
       this.maxWeight=maxWeight;
   }
   public int totalWeight(){
       int totalWeight= 0;
       for (Item var:items){
           totalWeight+=var.getWeight();
       }
       return totalWeight;
   }
   public void addItem(Item item){
       if (totalWeight()+item.getWeight()>maxWeight){
           return;
       }
       items.add(item);
   }
   public String toString (){
       int size = this.items.size();
       String  format ="";
       if (size==0){
           format = " no items ";
           return  format + " (" + totalWeight() + " kg)";
       }
       if (size==1){
           format = " item ";
       }else {
           format = " items ";
       }
       return  this.items.size() + format + "(" + totalWeight() + " kg)";
   }
   public void printItems(){
       for (Item var:items){
           System.out.println(var);
       }
   }
   public Item heaviestItem(){
       if (this.items.isEmpty()){
           return null;
       }
       Item toBeReturned = this.items.get(0);
       for (Item item:items){
           if (item.getWeight()>toBeReturned.getWeight()){
               toBeReturned=item;
           }
       }
       return toBeReturned;
   }
}