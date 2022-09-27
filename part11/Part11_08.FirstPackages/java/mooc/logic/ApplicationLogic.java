/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

/**
 *
 * @author david
 */
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface userInterface;
    public ApplicationLogic(UserInterface userInterface){
        this.userInterface = userInterface;


    }
    public void execute (int times){
        while (times>0){
            System.out.println("Application logic is working");
            userInterface.update();
            times--;
        }
    }
}