package Inheritance;

 class C {
	         int k;
	         C(){
		     System.out.println("C'is Constructor called");
	 }
 }
	
 class A extends C{
			 int i;
			 int k;
			 A(){
			 System.out.println("A'is Constructor called");		 
		}
 }
 class B extends A{
			 int j;
			 B(){
			 System.out.println("B'is Constructor called");
		 }
			
				
			}
	 