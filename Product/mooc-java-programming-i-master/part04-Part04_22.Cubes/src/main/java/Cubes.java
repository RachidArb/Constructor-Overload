
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(sentence);

            System.out.println(number * number * number);
}

    }
}
