
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nameAge = new HashMap<>();
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] arraySentence = sentence.split(",");
            int age = Integer.valueOf(arraySentence[1]);
            nameAge.put(arraySentence[0], age);
        }
        
        int maxAge = (Collections.max(nameAge.values()));
        for (Map.Entry<String, Integer> entry : nameAge.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxAge) {
                System.out.println("Name of the oldest: " + entry.getKey());     
            }
        }    
    }
}
