package xx;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main33 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Which file should have its contents printed? ");
        String filename = s.nextLine();

        // Allow only specific files
        if (filename.equals("C:\\\\Users\\\\Gametech\\\\Desktop\\\\a.txt") || filename.equals("data.txt")) {
            try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
                while (fileScanner.hasNextLine()) {
                    String row = fileScanner.nextLine();
                    System.out.println(row);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid file. Only 's.txt' or 'data.txt' allowed.");
        }

        s.close();
    }
}