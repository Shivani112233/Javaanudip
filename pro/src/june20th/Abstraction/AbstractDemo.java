package Abstraction;

public abstract class AbstractDemo{
	//It can have abstract and non-abstract methods (method with the body).
	// concrete method and abs 
		//It needs to be extended 
		//It cannot be instantiated.
		//It can have constructors and static methods also.
		//It can have final methods which will force the subclass not to change the body of the method.

	public abstract void customerdetails();//abstract method
	
	
	//concrtete method
	public void banklogo(){
		System.out.println("you can see everything");
	}


	public abstract void takeloan();


	public AbstractDemo(){
		this(100);
		System.out.println("constructor normally used");
				
	}

	public AbstractDemo(int speed) {
		System.out.println("speed is "+speed);
	}
	
	
}
