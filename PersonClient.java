package Lec22;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Person p = new Person("Puja", 19);
//		p.name="Pooja";
//		p.age=52;
//		System.out.println(p.name + " " + p.age);
		p.setName("Pooja");
		System.out.println(p.getName());
		p.setAge(-90);
		System.out.println(p.getAge());
		System.out.println("Bye");
		
	}

}
