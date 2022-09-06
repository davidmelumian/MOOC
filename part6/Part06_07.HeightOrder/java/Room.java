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
public class Room {
   private ArrayList<Person> persons;
    public Room (){
        this.persons= new ArrayList<>();
    }
    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty (){
     return    persons.isEmpty();
    }
    public ArrayList<Person>getPersons(){
      return   this.persons;
    }
    public Person shortest(){
       if (this.persons.isEmpty()){
           return null;
        }
       Person  toReturn = this.persons.get(0);
       for (Person element : this.persons){
           if (element.getHeight()< toReturn.getHeight()){
               toReturn=element;
           }
       }
       return toReturn;
    }
    public Person take (){
      Person shortest =   this.shortest();
      persons.remove(shortest);
      return shortest;
    }
}