package july9;

public class Demo4 {
//we cant access the string in literal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is an single threaded
		StringBuffer s=new StringBuffer("shivani");//for mutable string that means it can be changed
		s=s.append("shikha");
		for(int i=0;i<5;i++) {
			s.append(i);
		}

		System.out.println(s);
		
		
		//stringbuilder is fast than string builder because  it is an multithreaded/nonsynchronized.
		StringBuilder sb=new StringBuilder("ansu");//we can use multiple thread in this stringbuilder.
		sb.append(" ");
		System.out.println(sb);
		
	}

}
