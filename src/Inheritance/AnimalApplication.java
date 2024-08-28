package Inheritance;

public class AnimalApplication {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();
		t.eat();
		t.breath();
		t.sleep();
		d.eat();
		d.breath();
		d.sleep();
		m.eat();
		m.breath();
		m.sleep();
	}
}

