//you need to create a proffessor class that has attribute proffessor id
//,proffessor name,professor department. now you create a department class
//that has professor dept6 id ,dept name .now create a university class that has
//dept attribute.create array of 5 university object that should be distinct
//and change the name of proffessor name and proffessor id of last university 
//object without changing object


package HomeWork;

public class CompleteProgram {
	public static void main(String[] args) {
		Department d1=new Department();
		d1.setDepid(1);
		d1.setDepname("bca");
		
		Department d2=new Department(2,"bcs");
		Department d3=new Department(3,"bsc");
		Department d4=new Department(4,"bba");
		Department d5=new Department(5,"mba");
	
		
		
	Proffessor pf=new Proffessor();
	
	pf.setId(100);
	pf.setDepartment("BCA");
	pf.setName("RANJU");
	
	Proffessor pf2=new Proffessor(101,"rakhi","BCS");
	Proffessor pf3=new Proffessor(102,"RAJNI","BSC");
	Proffessor pf4=new Proffessor(103, "REENA","BBA");
	Proffessor pf5=new Proffessor(104, "RAM","MBA");
	
		
		
	University uty=new University();
	uty.setDepartment(d1);
	uty.setPf(pf);
	University uty2=new University(d2,pf2);
	University uty3=new University(d3,pf3);
	University uty4=new University(d4, pf4);
	University uty5=new University(d5, pf5);
	
	
	
		
	University []arr= {uty,uty2,uty3,uty4,uty5};
	
		
		
	///before changing 
	System.out.println("BEFORE CHANGING THE UNIVERSITY ID AND NAME");
		for(University  un:arr){
			System.out.println(un);
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//after changing id and name
		
		
		arr[4].getPf().setId(111);
		arr[4].getPf().setName("lakhan");
		
		System.out.println("AFTER CHANGING THE UNIVERSITY ID AND NAME");
		for(University  un:arr){
			System.out.println(un);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
