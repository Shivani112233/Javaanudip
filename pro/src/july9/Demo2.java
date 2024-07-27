package july9;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//through literal its always return true if both are in same location
		String s="welcome";
		String s2="welcome";
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		System.out.println(s==s2);//it compares reference not value
		System.out.println(s==s3);
		System.out.println(s==s4);
		
		
		System.out.println(s.equals(s4));//it compares contents not refernce
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s4));
		
		
		

	}

}
