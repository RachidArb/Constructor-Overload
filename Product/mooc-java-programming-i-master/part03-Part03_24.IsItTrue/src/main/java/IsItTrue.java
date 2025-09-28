
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.nextLine();
        if (word.equals("true")) {
            System.out.println("You got that right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
