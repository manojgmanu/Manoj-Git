package Collection;

import java.util.Vector;

public class VectorContainsContainsAllExample {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		  v1.add(10);
		  v1.add(20);
		  v1.add(30);
		  v1.add(40);
		  v1.add(50);
		  Vector v2 = new Vector();
		  v2.add(10);
		  v2.add(20);
		  v2.add(30);
		  v2.add(40);
		  v2.add(50);
		  v2.add(60);
		  v2.add(70);
		  System.out.println(v1);
		  System.out.println(v2);
		  System.out.println(v1.contains(30));
		  System.out.println(v1.contains(56));
		  System.out.println(v1.containsAll(v2));
		  System.out.println(v2.containsAll(v1));
		  System.out.println(v1.containsAll(v2));
		  System.out.println(v1.containsAll(v2));
		  System.out.println(v1.containsAll(v2));
		  
	}

}
