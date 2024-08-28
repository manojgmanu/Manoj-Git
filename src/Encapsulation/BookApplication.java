package Encapsulation;

public class BookApplication {
	 public static void main (String [] args) {
		Book b1;
		b1= new Book();
		b1.pages = 100;
		System.out.println("Values of pages "+b1.pages);
		b1.pages=-99;
		System.out.println("Values of pages "+b1.pages);
	 }
	}
