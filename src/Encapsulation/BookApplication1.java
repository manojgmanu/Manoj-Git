package Encapsulation;

public class BookApplication1 {
	 public static void main (String [] args) {
		 Book1 b1;
		 b1 = new Book1 ();
		 b1.setPages(100);
		 b1.setData(100);
		 System.out.println("Values of pages"+b1.getData());
		 b1.setData(-99);
		 System.out.println("Values of pages"+b1.getData());	 
	 }
}