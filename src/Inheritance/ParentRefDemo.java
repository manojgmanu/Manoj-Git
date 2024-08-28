package Inheritance;

public class ParentRefDemo {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child1 C1 = new Child1();
		Child2 C2 = new Child2();
		Parent ref;
		ref=p;
		ref.display();
		ref=C1;
		ref.display();
		ref=C2;
		ref.display();
	}
}
