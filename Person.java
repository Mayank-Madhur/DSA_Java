package Lec22;

public class Person {

	private String name = "Kaju";
	private int age = 20;

	public Person() {

	}

//	public Person(String name) {
//
//	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {

		return age;
	}

//	public void setAge(int age) throws Exception {
//		if (age < 0 || age > 90) {
//		throw new Exception("Bklol Age ka range sahi dedo");
//		}
//		this.age = age;
//	}
	public void setAge(int age) {
		try {
		if (age < 0 || age > 90) {
			throw new Exception("Bklol Age ka range sahi dedo");
		}
		this.age = age;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}