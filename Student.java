package Lec22;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {
		System.out.println("My name is " + this.name + " and age is " + this.age);
	}

	public void SayHey(String name) {

		System.out.println(this.name + " Say Hey " + name);
	}

	public static void MentorName(Student s) {
		s.Intro_yourSelf();
		System.out.println("Monu Bhaiya" + " "+s.name);
	}
	static {
		System.out.println("Student Class Block1 ");
	}
	static {
		System.out.println("Student Class Block2 ");
	}
}