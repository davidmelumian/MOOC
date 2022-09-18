/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Item {
    private String  name;
    private int qty;
    private int unitPrice;
    public Item (String  name, int qty, int unitPrice){
        this.name=name;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    public int price(){
        return this.unitPrice*this.qty;
    }
    public void increaseQuantity(){
        this.qty++;
    }
    public int getQty (){
        return this.qty;
    }
    public String toString(){
        //return  "an item that contains " + this.qty +  " " + this.name + " has the total price of " + this.price() + "\n"
        return  this.name + ": " + this.qty;
    }

}
