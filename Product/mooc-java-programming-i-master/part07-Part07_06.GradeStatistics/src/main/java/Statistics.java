/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author miguel
 */
public class Statistics {
    
    public void averagePoints(int count, int sum) {
        double average = (double) sum / count;
        System.out.println("Point average (all): " + average);
    }
    
    public void averagePassingPoints(int count, int sum) {
        double average = (double) sum / count;
        if (count > 0) {
            System.out.println("Point average (passing): " + average);
        } else {
            System.out.println("Point average (passing): -");
        }
    }
    
    public void passedPercentage(int countPassed, int count) {
        double approvedPercentage = 100 * (double) countPassed / count;
        System.out.println("Pass percentage: " + approvedPercentage);
    }
    
    public void gradeDistribution(ArrayList<Integer> points) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
   
        for (Integer number : points) {
            if (number < 50) {
                zero++;
            } else if (number < 60) {
                one++;
            } else if (number < 70) {
                two++;
            } else if (number < 80) {
                three++;
            } else if (number < 90) {
                four++;
            } else if (number >= 90) {
                five++;
            }
        }
        
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(zero);
        grades.add(one);
        grades.add(two);
        grades.add(three);
        grades.add(four);
        grades.add(five);
        System.out.println("Grade distribution:");
        
        for (int i = grades.size() - 1; i >= 0; i--) {
            System.out.print(i + ":");
            for (int j = 0; j < grades.get(i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
