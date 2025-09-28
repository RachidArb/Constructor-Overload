
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(Paths.get("data.txt"))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
