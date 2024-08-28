package Inheritance;

 class A2 {
	int i ;
 }
 class B2 extends A2 {
	 int i ;
	 
	 public void setData (int x, int y) {
		 super.i=x;
		 i=y;
	 }
	  public void disp () {
		  System.out.println("A's i valuve is" + super.i);
		  System.out.println("A's i valuve is" + i);
		  
	  }
}
