package lms;

public class Person {

	private int age;

	public Person(int age) throws InvalidAgeException{
		if(age<18 ||age>100) {
			throw new InvalidAgeException( ". Age must be between 18 and 100."+age);
		}

		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		try {
            Person person1 = new Person(25);
            System.out.println("Person 1 age: " + person1.getAge());
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

        try {
            Person person2 = new Person(15);
            System.out.println("Person 2 age: " + person2.getAge());
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

	}
}
