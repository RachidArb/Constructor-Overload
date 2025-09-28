/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
import java.util.*;

public class Room {
    
    ArrayList<Person> listOfPersons; 
    
    public Room() {
        listOfPersons = new ArrayList<>();
    }
    
    public void add(Person person) {
        listOfPersons.add(person);
    }
    
    public boolean isEmpty() {
        return listOfPersons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return listOfPersons;
    }
    
    public Person shortest() {
        if (listOfPersons.isEmpty()) {
            return null;
        }
        
        //int sortestHeight = Integer.MAX_VALUE;
        Person personObject = new Person("miguel", Integer.MAX_VALUE);
                
        for (Person element : listOfPersons) {
            if (personObject.getHeight() > element.getHeight()) {
                personObject = element;
            }
        }
        return personObject;
    }
    
    public Person take() {
        if (listOfPersons.isEmpty()) {
            return null; 
        }
        
        
       int shortestIndex = 0; 
       for (int i = 0; i < listOfPersons.size(); i++) {
           if (shortest().equals(listOfPersons.get(i))) {
               shortestIndex = i;
           }
       }
        
       return listOfPersons.remove(shortestIndex);
        
    }
    
}
