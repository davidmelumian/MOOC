/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Cat extends  Animal implements NoiseCapable{
    public Cat (String name){
        super(name);
    }
    public Cat(){
        super("Cat");
    }
    public void purr(){
        System.out.println(super.getName() + " purrs");
    }
//    public void eat(){
//        System.out.println(super.getName() + "eats");
//    }
//    public void sleep(){
//        System.out.println(super.getName() + "sleeps");
//    }

    @Override
    public void makeNoise() {
        purr();
    }
}
