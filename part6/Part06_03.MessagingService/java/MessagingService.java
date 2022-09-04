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
public class MessagingService {
    ArrayList<Message> lom ;
    public MessagingService(){
        this.lom=new ArrayList<>();
    }
    public void add (Message message){
        if (message.size()){
            lom.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        return lom;
    }
    public void printMessages(){
        for (Message var:lom){
            System.out.println(var);
        }
    }
}
