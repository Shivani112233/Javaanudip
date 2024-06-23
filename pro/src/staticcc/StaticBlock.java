package staticcc;

public class StaticBlock {

	//static block  
	
		static {
			System.out.println(" mai hu static block ");
		}
		
		public static void main(String[] args) {
			
			
			System.out.println("hello mai hu main method ");
			
			StaticBlock  a  = new StaticBlock() ;
			
			//hello mai hu main method 
			//mai hu static block 
			
			
			
		}
}
