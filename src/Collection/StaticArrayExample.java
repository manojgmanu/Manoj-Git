package Collection;

import java.util.Arrays;
import java.util.Scanner;

public class StaticArrayExample {

	public static void main(String[] args) {
	 int arr[] = new int[5];
	 Scanner scan = new Scanner (System.in);
	 for (int i=0 ; i < arr.length ; i++) {
		 	System.out.println("Enter the number");
		 	 arr[i] = scan.nextInt();
	 }
	 	System.out.println("The arrays Contents are");

	 	System.out.println(Arrays.toString (arr));
	}

}
