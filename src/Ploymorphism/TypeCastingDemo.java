package Ploymorphism;

public class TypeCastingDemo {

	public static void main(String[] args) {
		 fighter1 f = new fighter1 ();
		 plane1 ref ;
		 ref= f;
		//ref=plane1   //Upcasting
		 ref.takeoff();
		// ref.launchmissle();           //Downcasting
		((fighter1)(ref)).lauchmissile();
		 
	}

}
