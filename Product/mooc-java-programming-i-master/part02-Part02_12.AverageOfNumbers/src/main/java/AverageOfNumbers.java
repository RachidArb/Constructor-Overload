
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double numbers = 0;
        double average = 0.0;
        
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.next());
            
            if (value == 0) {
                break;
            }
            
            sum += value; 
            numbers++;

        }
        
        average = (double) sum / numbers;
        System.out.println("Average of the numbers: " + average);

    }
}
