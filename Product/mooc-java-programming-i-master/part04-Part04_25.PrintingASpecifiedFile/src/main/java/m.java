package xx;
import java.nio.file.Paths;
import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Which file should have its contents printed?");
		String filename = s.nextLine();
		try(Scanner i = new Scanner(Paths.get(filename))){while(i.hasNextLine()) { 
			String row = i.nextLine();
			System.out.println(row);}
		catch(Exception e) { System.out.println("Error : "+e.getMessage());
		}
	}

}
