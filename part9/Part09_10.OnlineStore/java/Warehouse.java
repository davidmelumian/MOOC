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
import java.util.Set;

public class Warehouse {
    private Map<String,Integer> products;
    private Map<String,Integer> stocks;
    public Warehouse(){
        this.products=new HashMap<>();
        this.stocks=new HashMap<>();
    }
    public void addProduct (String product,int price, int stock){
        products.put(product,price);
        stocks.put(product,stock);
    }
    public int price (String product){
        if (products.get(product)==null){
            return -99;
        }
       return products.get(product);
    }
    public int stock (String product){
        if (stocks.get(product)==null){
            return 0;
        }
        return stocks.get(product);
    }
    public boolean take(String product) {
        if (!(stocks.get(product) == null)&&stocks.get(product) - 1 >= 0 ) {
            stocks.put(product, (stocks.get(product) - 1));
            return true;
        }
        return false;
    }
     public void print(){
         System.out.println(this.stocks.keySet());
         System.out.println(this.stocks.values());
    }
    public Set<String> products (){
        System.out.println("products:");
        return  this.products.keySet();
    }


}
