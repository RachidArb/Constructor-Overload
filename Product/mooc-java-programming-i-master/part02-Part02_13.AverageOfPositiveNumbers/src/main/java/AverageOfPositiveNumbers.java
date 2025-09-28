
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numbers = 0;
        double sum = 0;
        double average = 0; 
        
        while (true) {
            int value = Integer.valueOf(scanner.next());
            
            if (value == 0) {
                break;
            }
            if (value > 0) {
                sum += value;
                numbers++;
            }
        }
        
        average = sum / numbers; 
        if (average >= 0) {
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
