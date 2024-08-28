package Inheritance;

public class PlaneApplicaton {

	public static void main(String[] args) {
		Cargo C1 = new Cargo();
		C1.takeoff();
		C1.CarryCargo();
		C1.fly();
		C1.land();
		
		Passanger P = new Passanger();
		P.takeoff();
		P.CarryPassanger();
		P.fly();
		P.land();
		
		Fighter F = new Fighter();
		F.takeoff();
		F.CarryWeapon();
		F.fly();
		F.land();

	}

}
