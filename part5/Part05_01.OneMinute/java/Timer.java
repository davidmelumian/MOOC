/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Timer {
        private ClockHand hundreds;
    private ClockHand seconds;
    public  Timer (){
        this.hundreds=new ClockHand(100);
        this.seconds = new ClockHand(60);

    }
    public void advance(){
        this.hundreds.advance();
        if (this.hundreds.value()==0){
            this.seconds.advance();
        }
    }
    public String  toString(){
        return this.seconds +":" + this.hundreds;
    }
}
