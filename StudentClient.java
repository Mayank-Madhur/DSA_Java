package Lec22;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 21;
		s1.Intro_yourSelf();
		Student s2 = new Student();
		s2.name = "Dev Das";
		s2.age = 55;
		s2.Intro_yourSelf();// ??
		s1.SayHey("Raju");
		Student.MentorName(s1);
		// s1.MentorName();

	}

	static {
		System.out.println("StudentClient Class Block1 ");
	}
}
