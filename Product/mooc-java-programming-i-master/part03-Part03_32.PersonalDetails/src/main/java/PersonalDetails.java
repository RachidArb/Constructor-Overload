
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalDetails {

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
        
        int longestLength = Integer.MIN_VALUE;
        String longestName = "";
        for (Map.Entry<String, Integer> entry : nameAge.entrySet()) {  // Itrate through hashmap
            if (entry.getKey().length() > longestLength) {
                longestLength = entry.getKey().length();
                longestName = entry.getKey();
            }
        }  
        
        System.out.println("Longest name: " + longestName);
        
        int sum = 0;
        int count = 0;
        for (Map.Entry<String, Integer> entry : nameAge.entrySet()) {  // Itrate through hashmap
            sum += entry.getValue();
            count++;
        }  
        
        double average = (double) sum / count;
        System.out.println("Average of the birth years: " + average);

    }
}
