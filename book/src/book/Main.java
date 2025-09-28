package book;

public class Main {

	public static void main(String[] args) {
		Book ook = new Book("ahmed sefrioui","boite a merveille",155);
		System.out.println(ook);
		System.out.println(ook.getAuthor());
		System.out.println(ook.getName());
		System.out.println(ook.getPages()+" pages");
	}
	

}
