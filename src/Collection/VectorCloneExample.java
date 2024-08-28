package Collection;

import java.util.Vector;

public class VectorCloneExample {

	public static void main(String[] args) {
	  Vector v1 = new Vector();
	  v1.add(10);
	  v1.add(20);
	  v1.add(30);
	  v1.add(40);
	  v1.add(50);
	  Vector v2 = (Vector)v1.clone();
	  System.out.println("Just After Downcasting");
	  System.out.println(v1);
	  System.out.println(v2);
	  System.out.println("Modifying v2");
	  System.out.println(v1);
	  System.out.println(v2);
	}

}
