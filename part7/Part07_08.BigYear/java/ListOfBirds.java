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

public class ListOfBirds {
    private ArrayList<Bird> birds;

    public ListOfBirds() {
        this.birds = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        Bird test = new Bird();
        test.addBird(name, latinName);
        birds.add(test);
    }
    

    public void printBirds() {
        for (Bird var : birds) {
            System.out.println(var);
        }
    }

    public void printOneBird(String name) {
        for (Bird var : birds) {
            if ((var.getName().equals(name)) || (var.getLatinName().equals(name))) {
                System.out.println(var);
            }
        }
    }
    public void check (String name){
        for (Bird var:birds){
            if ((var.getName().equals(name)) || (var.getLatinName().equals(name))){
                var.setObservationCount();
            }
        }
    }

}
