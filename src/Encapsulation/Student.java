package Encapsulation;

public class Student {
	private String name;
	private int age;
	private float weight;
	public void setData(String name, int age, double d) {
		name = name;
		age= age;
		d=d;
	}
	public String getData() {
		return name +"," +age+","+weight;
	}
}
