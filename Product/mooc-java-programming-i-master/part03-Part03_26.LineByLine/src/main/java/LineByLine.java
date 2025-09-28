
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] arraySentence = sentence.split(" ");
            for (String word : arraySentence) {
                System.out.println(word);
            }
        }

    }
}
