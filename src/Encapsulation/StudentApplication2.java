package Encapsulation;

public class StudentApplication2 {
	
	public static void main(String[] args) {
		StudentData s1 = new StudentData();
		StudentData s2 = new StudentData();
		s1.setData("Manoj", 24, 65.5f);
		s2.setData("Virat", 34, 75.5f);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.weight);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s1.weight);
	}

}
