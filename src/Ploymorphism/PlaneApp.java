package Ploymorphism;

public class PlaneApp {

	public static void main(String[] args) {
	Cargo c = new Cargo ();
	Passanger p = new Passanger ();
	Fighter f = new Fighter ();
	Airport a = new Airport ();
	a.allowplane(c);
	a.allowplane(p);
	a.allowplane(f);
	}
}
