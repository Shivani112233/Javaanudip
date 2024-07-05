package Abstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// DemoAbstract  a  = new DemoAbstract() ;// you can't instantiated this 
		ChildOfAbstract bb  = new ChildOfAbstract() ; // this is child class now you can create object of this class 
		// and you can entire method of that abs class 
		bb.banklogo(); 
		bb.customerdetails(); 
		bb.takeloan() ;
		
		
		DemoInterface.showCustomer();
	}

	}

