package overiding;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cat=new Dog();
		Animal dog=new Cat();
		Animal cow=new Cow();
		
		cat.makesound();
		dog.makesound();
		cow.makesound();

	}

}
