package Lec24;

public class Student {

	String name;
	int age;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+" "+age;
	}

}