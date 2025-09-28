
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;

public class AgeOfTheOldest {

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
        System.out.println("Age of the oldest: " + maxAge);

    }
}
