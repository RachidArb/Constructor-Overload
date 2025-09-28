
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            listOfNumbers.add(number);        
        }
        
        int minimum = listOfNumbers.get(0); 
        int index = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (minimum > listOfNumbers.get(i)) {
                minimum = listOfNumbers.get(i);
                index = i;
            }
        }

        System.out.println("Smallest number: " + minimum);
        System.out.println("Found at index: " + index);
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
