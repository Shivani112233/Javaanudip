package lms;
public class Student {

	// creating instance variables
	String name;
	int age;
	String department;

	// default constructor
	public Student() {
		this.name = "UNKNOWN";
		this.age = 20;
		this.department = "UNASSIGNED";
	}

	// parametrize constructor ->> with two arguements
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
		this.department = "IT";

	}

	
	// parametrize constructor ->> with three arguements
	public Student(int age, String name, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	

}
