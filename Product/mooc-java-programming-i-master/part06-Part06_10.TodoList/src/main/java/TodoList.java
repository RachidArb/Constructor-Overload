/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> listOfTasks;
    
    public TodoList() {
        this.listOfTasks = new ArrayList<>();
    }
    
    public void add(String task) {
        listOfTasks.add(task);
    }
    
    public void print() {
        for (int i = 0; i < listOfTasks.size(); i++) {
            int id = i + 1;
            System.out.println(id + ": " + listOfTasks.get(i));
        }
    }
    
    public void remove(int number) {
        listOfTasks.remove(number - 1);
    }   
}
