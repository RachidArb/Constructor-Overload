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

public class TextUI {
    
    private Scanner input;
    private SimpleDictionary dicio;
    
    public TextUI(Scanner input, SimpleDictionary dicio) {
       this.input = input;
       this.dicio = dicio;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userOption = input.nextLine();

            if (userOption.equals("end")) {
                end();
                return;
            } else if (userOption.equals("add")) {
                add();
            } else if (userOption.equals("search")) {
                search();
            } else {
                System.out.println("Unknown command");
            }            
        }
    }
    
    public void end() {
        System.out.println("Bye bye!");
    }
    
    public void add() {
        System.out.print("Word: ");
        String word = input.nextLine();
        System.out.print("Translation: ");
        String translation = input.nextLine();
        this.dicio.add(word, translation);
    }
    
    public void search() {
        System.out.print("To be translated: ");
        String wordToTranslate = input.nextLine();
        if (this.dicio.translate(wordToTranslate) != null) {
            System.out.print("Translation: ");
            System.out.println(this.dicio.translate(wordToTranslate));
        } else {
            System.out.println("Word " + wordToTranslate + " was not found");
        }    
    }
}    
