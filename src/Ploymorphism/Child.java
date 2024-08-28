package Ploymorphism;

 class Child extends Parent {
	  int x,y;
	  Child(){
		  this(10);
		  System.out.println("0 Parameter Constructer Excuted");
	  }
	  Child (int a){
		this (10,20);
		 System.out.println("1 Parameter Constructer Excuted");
	  }
	  Child (int a, int b){
		  System.out.println("3 Parameter Constructer Excuted");
	  }
}
