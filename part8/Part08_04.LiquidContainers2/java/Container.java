/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Container {
    private int currentValue;
    private int maxValue;
    public Container(){
        this.currentValue=0;
        this.maxValue=100;
    }
    public int contains(){
        return this.currentValue;
    }
    public void add (int amount) {
        if (amount<=0){
            return;
        } else if (amount+currentValue>=maxValue) {
            currentValue=maxValue;
        }else {
            currentValue+= amount;
        }
    }
    public void remove (int amount){
        if (amount<=0) {
            return;
        } else if (amount>=currentValue) {
            currentValue-= currentValue;
        }else {
            currentValue-= amount;
        }
    }
    public String  toString (){
        return  currentValue + "/" + maxValue;
    }
}