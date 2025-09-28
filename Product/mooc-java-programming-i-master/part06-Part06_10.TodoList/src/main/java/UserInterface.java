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

import java.util.Scanner;

public class UserInterface {
    
    private TodoList listOfTasks;
    private Scanner input;
    
    
    public UserInterface(TodoList list, Scanner input) {
        this.listOfTasks = list;
        this.input = input;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userCommand = input.nextLine();
            switch (userCommand) {
                case "stop": 
                    return;
                case "add":
                    add();
                    break;
                case "list":
                    list();
                    break;
                case "remove":
                    remove();
                    break;
                default: 
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String toAdd = input.nextLine();
        listOfTasks.add(toAdd);
    }
    
    public void list() {
        listOfTasks.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(input.nextLine());
        listOfTasks.remove(index);
    }
    
}
