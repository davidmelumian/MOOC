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
public class Stack {
    private ArrayList<String> los ;
    public Stack (){
        this.los = new ArrayList<>();
    }
    public boolean isEmpty(){
       return los.isEmpty();
    }
    public void add (String value){
        los.add(value);
    }
    public ArrayList<String >values (){
        return los;
    }
    public String take (){
        int size = this.los.size()-1;
        String  value = los.get(size);
        los.remove(size);
        return value;

    }

}