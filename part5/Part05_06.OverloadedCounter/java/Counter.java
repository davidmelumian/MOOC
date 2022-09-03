/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Counter {
    private int number;
    public Counter (int startValue){
        this.number=startValue;
    }
    public Counter (){
        this.number=0;
    }
    public int value (){
        return this.number;
    }
    public void increase(){
        this.number++;
    }
    public void decrease(){
        this.number--;
    }
    public void increase(int increaseBy){
        if (increaseBy<0){
            return;
        }
        this.number+=increaseBy;
    }
    public void decrease(int decreasyBy){
        if (decreasyBy<0){
            return;
        }
        this.number-=decreasyBy;
    }@Override
    public String toString(){
        return String.valueOf( this.number);
    }
}