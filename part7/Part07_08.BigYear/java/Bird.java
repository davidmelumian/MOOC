/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Bird {
    private String  name;
    private String  latinName;
    private int  observationCount;
    public Bird (){
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservationCount() {
        return observationCount;
    }
    public Bird addBird (String name, String latinName){
        this.name=name;
        this.latinName=latinName;
        return this;
    }
    public String toString (){
        return  this.name + "(" + this.latinName + "): " + this.observationCount + " observations";
    }

    public void setObservationCount() {
        this.observationCount ++;
    }
}
