package Inheritance;

public class PlaneApplication {

	public static void main(String[] args) {
		Cargo1 c = new Cargo1();
		Plane1 ref ;
		ref = c;
		ref.takeoff();
		ref.fly();
		ref.land();
		//ref.CarryCargo(); Error bcz Specilized method 

	}

}
