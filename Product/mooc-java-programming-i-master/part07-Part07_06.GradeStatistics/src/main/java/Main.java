import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int count = 0;
        int countPassed = 0;
        int sum = 0;
        int sumPassed = 0;
        ArrayList<Integer> points = new ArrayList<>();
        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } else if (number >= 0 && number <= 100) {
                sum += number;
                count++;
                points.add(number);
                if (number >= 50) {
                    sumPassed += number;
                    countPassed++;
                }
            }
        }
        Statistics stats = new Statistics(); 
        stats.averagePoints(count, sum);
        stats.averagePassingPoints(countPassed, sumPassed);
        stats.passedPercentage(countPassed, count);
        stats.gradeDistribution(points);
    }
}
