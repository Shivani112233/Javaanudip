package lms;

public class Main1 {

	public static void main(String[] args) {
		Student s=new Student();
		Student s2=new Student(24 , "shivani");
		Student s3=new Student(26, "rani" ,"BCA");
		
		System.out.println("this the default constructor");
		System.out.println("student age : " + s.age+ " , "  + "student name :" +s.name + " ," +" Student department :"  +s.department );
		
	
		System.out.println("this the parametrize constructor ->> with two arguements");
		System.out.println("Student age:" +s2.age + " ,"  +"Student name :" +s2.name+ " ," +" Student department :"  +s2.department );
		
		
		System.out.println("this the parametrize constructor ->> with three arguements");
		System.out.println("Student age:" +s3.age + " ,"  +"Student name :" +s3.name+ " ," +" Student department :"  +s3.department );
		
		
		
	}

}
