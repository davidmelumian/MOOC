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
import java.util.Iterator;
import java.util.List;

public class Employees {
   private List<Person> people;
   public Employees(){
       this.people=new ArrayList<>();
   }

    public List<Person> getPeople() {
        return people;
    }

    public void add(Person personToAdd){
       people.add(personToAdd);
   }
   public void add(List<Person> peopleToAdd){
       Iterator<Person> personIterator = peopleToAdd.iterator();
       while (personIterator.hasNext()){
          people.add(personIterator.next());
       }
   }
   public void print(){
       Iterator<Person> personIterator = people.iterator();
       while (personIterator.hasNext()){
           System.out.println(personIterator.next());
       }
   }
   public void print (Education education){
       Iterator<Person> personIterator = people.iterator();
       while (personIterator.hasNext()){
           Person personNext = personIterator.next(); //  без этой переменной, некорректно выводит на печать. особенности java,  о которых пока не знаю.
           if (personNext.getEducation().ordinal()==(education.ordinal())){
               System.out.println(personNext);
           }
       }
   }
   public void fire(Education education){
       Iterator<Person> personIterator= people.iterator();
       while (personIterator.hasNext()){
           if (personIterator.next().getEducation()==education){
               personIterator.remove();
           }
       }
   }
}