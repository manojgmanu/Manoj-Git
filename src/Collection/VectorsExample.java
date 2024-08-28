package Collection;

import java.util.Scanner;
import java.util.Vector;

public class VectorsExample {

	public static void main(String[] args) {
		int Choice,data ;
		Scanner scan = new Scanner (System.in);
		Vector  v = new Vector();
		do {
			System.out.println("Enter the data");
			data = scan.nextInt();
			v.add(data);
			System.out.println("Press 1 For Continue");
			System.out.println("Press 2 For Stop");
			Choice = scan.nextInt();
		} while (Choice == 1);
		System.out.println(v);
	}

}
