package Ploymorphism;

 class Demo {
	 Demo (){
	  this(10);
	  System.out.println("Inside the 0 parameter Constructed");
}
	 Demo (int num){
		 this (10,20);
		 System.out.println("Inside the 1 Parameter Condtructed");
	 }
	 Demo (int num1,int num2){
		 System.out.println("Inside the 2 Parameter Constructed");
	 }
}