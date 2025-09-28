
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] arraySentence = sentence.split(" ");
            System.out.println(arraySentence[arraySentence.length -1]);
        }


    }
}
