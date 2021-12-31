package oop;

class Person {

	String name;
	String email;
	String phone;

	void walk() {

		System.out.println(name + " is walking.");

	}

	void eat() {

		System.out.println(email);

	}

	void sleep() {

		System.out.println(name + " is sleeping.");

	}

}

public class Demo {

	public static void main(String[] args) {

		// Instantiating an object
		Person p1 = new Person();

		// Defining properties of object
		p1.name = "Nadia";
		p1.email = "nadiahuang29@gmail.com";
		p1.phone = "0733899355";

		// Abstraction
		p1.walk();
		p1.eat();
		p1.sleep();

		Person p2 = new Person();

		p2.name = "Jane";
		p2.walk();

//		// Person...
//		// Adjectives, variables, adjectives, descriptors
//		String name = "Nadia";
//		String email = "nadiahuang29@gmail.com";
//		String phone = "0733899355";
//
//		// Action, behaviour, activity
//		walking(name);
//		System.out.println(name + " is eating.");
//
//		String name2 = "Jane";
//		String email2 = "janed@gmail.com";
//		String phone2 = "0812899355";
//
//		// Action, behaviour, activity
//		walking(name2);
//		System.out.println(name2 + " is eating.");

	}

//	static void walking(String name) {
//
//		System.out.println(name + " is walking.");
//
//	}

}