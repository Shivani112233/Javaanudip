package june8th;

public class Demo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Address ad1 = new Address();
		 ad1.setDistrict("Ramgarh");
		 ad1.setState("Jharkhand");
		 
	    
	      
	      Student s1 = new Student();
	      s1.setAddress(ad1);
	      s1.setMarks(89);
	      s1.setRoll("AF67890");
	      s1.setAge("25");
	      System.out.println(s1.getAddress());
	      System.out.println(s1.getAge());
	      System.out.println( s1.getAddress().getState());
	      System.out.println(s1);
	      
	      
	   }

	}


