/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatiana
 */
public class Container {
    private int current;
    private int max;
    public Container(){
        this.current=0;
        this.max=100;
    }
    public int contains (){
        return current;
    }
    public void add (int amount){
        if (amount<0){
            return;
        }
        if (this.current+amount>100){
            this.current= 100;
        }else {
            this.current+=amount;
        }

    }
    public void remove (int amount){
        if (amount<0){
            return;
        }
        if (this.current<amount){
            this.current=0;
        }
        else {
            this.current-=amount;
        }
    }
    public String  toString(){
        return  this.current + "/" + this.max;
    }
    
}
