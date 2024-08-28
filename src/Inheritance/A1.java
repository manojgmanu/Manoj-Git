package Inheritance;

 class A1 {
	 int i;
 }
class B1 extends  A1{
	int i;

 	public void setData (int x, int y) {
 		i=x;
 		i=y;
 		}
 	
 	public void disp() {
 		System.out.println("A' is i value is " +i);
 		System.out.println("B' is i value is " +i);
 		}
 	}