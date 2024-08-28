package Ploymorphism;

public class Airport {
	 void allowplane(Cargo ref) {
		 ref.takeoff();
		 ref.fly();
		 ref.land();
	 }
	 void allowplane (Passanger ref) {
		 ref.takeoff();
		 ref.fly();
		 ref.land();
	 }
	 void allowplane (Fighter ref) {
		 ref.takeoff();
		 ref.fly();
		 ref.land();
	 }
}