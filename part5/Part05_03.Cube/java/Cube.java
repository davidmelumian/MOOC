/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Cube {
    private int size;
    public Cube (int size){
        this.size=size;
    }
    public int volume (){
        return this.size*this.size*this.size;
    }
    public String toString(){
        return  "The length of the edge is " + this.size + " and the volume " +volume();
    }
}
