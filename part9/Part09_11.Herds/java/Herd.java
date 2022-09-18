/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.ArrayList;

public class Herd  implements  Movable{
    private ArrayList<Movable> object;
    public Herd (){
        this.object=new ArrayList<>();
    }
    public String  toString() {
        int i = 0;
        String string = "";
        while (i < object.size()) {
           string = string.concat( object.get(i).toString() + "\n");
           i++;
        }
        return string;
    }
    public void addToHerd(Movable movable){
        object.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (int i = 0; i < this.object.size(); i++) {
            object.get(i).move(dx, dy);
        }
    }
}