package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void email () {
		System.out.println(email);
	}
	
	void sleep () {
		System.out.println(name + " is sleeping.");
	}
}





public class Demo {
	
	public static void main(String [] args)
	{
		// Person
		Person person1 = new Person();
		
		person1.name = "Bilal";
		person1.email = "abcd@gmail.com";
		person1.phone = "123456789";
		
		
		person1.walk();
		person1.email();
		person1.sleep();
	}
}
