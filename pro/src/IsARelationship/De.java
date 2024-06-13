package IsARelationship;

public class De {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Appliance a  = new Appliance() ;
			
			a.setBrandname("Voltas"); 
			
			a.setPrice(42000);
		
			System.out.println(a);
			
			
			Telivision t1  = new Telivision() ;  // default  cons .
			t1.setBrandName("ACER") ;
			t1.setLoudness("60db"); 
			t1.setPrice(43000); 
			t1.setSize(32);
			
			System.out.println(t1);
			t1.changeChanel();
			t1.mainFunction();
			
			
			
			Telivision t2  = new Telivision( 32  , "45db") ;  
			
			Telivision t3  = new Telivision("samsung" , 400000 , 48 , "56db") ; 
			
	
		
		
		
		
		
	}

	}


