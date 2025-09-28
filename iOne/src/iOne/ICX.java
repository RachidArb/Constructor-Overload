package iOne;
import java.util.Scanner;

public class ICX {
    
  public static void main(String[] args) {
}
    	Scanner sc = new Scanner(System.in);
    	Scanner sc = new Scanner(System.in);
    	Scanner sc = new Scanner(System.in);
        // Using next()
        System.out.println("Enter your first name:");
        String firstName = sc.next();  // Reads only one word
        System.out.println("First name (using next): " + firstName);
pr	
        sc.nextLine(); // Clear the leftover newline from next()

        // Using nextLine()
        System.out.println("Enter your full name:");
        String fullName = sc.nextLine();  // Reads the whole line until Enter
        System.out.println("Full name (using nextLine): " + fullName);

        sc.close();
    }
}
