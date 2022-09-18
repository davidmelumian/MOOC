/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Dog extends  Animal implements  NoiseCapable{

    public Dog (String name){
        super(name);
    }
    public Dog(){
        super("Dog");
        // or this("Dog");
    }
    public void bark(){
        System.out.println(super.getName()+ " barks");
    }

//    @Override
//    public void eat() {
//        super.eat();
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println(super.getName() + " sleeps");
//    }
    @Override
    public void makeNoise() {
        bark();
    }
}
