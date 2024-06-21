package overiding;

public class Animal {
	public void makesound() {
		System.out.println("generic animal sound");
	}
}

class Dog extends Animal{
	public void makesound() {
		System.out.println("bow bow");
	}
}

class Cat extends Animal{
	public void makesound() {
		System.out.println("meow meow");
	}
}


class Cow extends Animal{
	public void makesound() {
		System.out.println("me me");
	}
}