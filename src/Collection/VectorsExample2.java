package Collection;

import java.util.Vector;
import java.util.Scanner;

public class VectorsExample2 {

	public static void main(String[] args) {
	  int Choice,data;
	  Scanner scan = new Scanner (System.in);
	  Vector v = new Vector ();
	  System.out.println(v.capacity());
	  System.out.println(v.size());
	  v.add(10);
	  v.add(20);
	  v.add(30);
	  v.add(40);
	  v.add(50);
	  System.out.println("1 param");
	  System.out.println(v.capacity());
	  System.out.println(v.size());
	  v.add(60);
	  v.add(70);
	  v.add(80);
	  v.add(90);
	  v.add(100);
	  System.out.println("2 param");
	  System.out.println(v.capacity());
	  System.out.println(v.size());
	  v.add(110);
	  System.out.println("3 param");
	  System.out.println(v.capacity());
	  System.out.println(v.size());
	  System.out.println(v.capacity());
	  System.out.println(v.size());
	  System.out.println(v.capacity());
	  System.out.println(v.size());
	  System.out.println(v.capacity());
	  System.out.println(v.size());
	}
}
