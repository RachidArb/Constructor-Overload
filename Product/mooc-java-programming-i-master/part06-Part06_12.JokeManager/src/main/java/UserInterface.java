/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokeManager;
    private Scanner input;
    
    public UserInterface(JokeManager jokeManager, Scanner input) {
        this.jokeManager = jokeManager; 
        this.input = input; 
    }
    
    public void start() {
        while (true) {
            printMenu();
            String command = input.nextLine();
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = input.nextLine();
                jokeManager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (command.equals("3")) {
                jokeManager.printJokes();
            } else if (command.equals("X")) {
                break;
            }
        }
    }
    
    public void printMenu() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
}
