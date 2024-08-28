package Inheritance;

class Room {
 int lenght , breadth;
 Room(int lenght,int breadth) {
	 this.lenght=lenght;
	 this.breadth=breadth;
 }
 void area () {
	 int res ;
	 res = lenght*breadth;
	 System.out.println("the area is " +res);
 }
}
 class BedRoom extends Room {
	 int height ;
	 BedRoom(int lenght, int breadth, int height){
		 super(lenght,breadth);
		 this.height=height;
	 }
	 void volume () {
		 int res ;
		 res = lenght*breadth*height;
		 System.out.println("the volume is " +res);
	 }
 }
