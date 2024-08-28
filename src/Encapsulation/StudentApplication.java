package Encapsulation;

public class StudentApplication {
 public static void main(String[] args) {
	 Student s1;
	 s1=new Student();
	 s1.setData("Manoj",24,65.5f);
	 System.out.println("The Student into " +s1.getData());
 }
}