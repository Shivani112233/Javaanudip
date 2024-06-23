package firstpackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b  = new Bank() ;
		System.out.println("banak ka genral rate "+b.rate());

	     SBI sb = new SBI() ;
	     
	     System.out.println("sbi ka rate of intrest "+ sb.rate());
	     
	     
	     AXIS  axis  = new AXIS() ;
	     System.out.println("axis ka rate of intrest "+axis.rate() );
		
		
			
		}


	}


