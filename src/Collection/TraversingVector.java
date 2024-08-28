package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TraversingVector {

	public static void main(String[] args) {
		Vector  v = new Vector();
		v.add(10);
		v.add(20);
		System.out.println(v);
	for (int i=0; i< v.size();i++) {
		System.out.println(v.get(i));
	}
	Iterator itr = v.iterator();
	while(itr.hasNext() == true){
		System.out.println(itr.next());
		}
	
	ListIterator litr = v.listIterator();
	while(litr.hasNext() == true){
	System.out.println(litr.next());
	}
	
	Enumeration en = v.elements();
	while(en.hasMoreElements() == true){
		System.out.println(en.nextElement());
}
	}
}
