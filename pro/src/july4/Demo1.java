package july4;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []ar=new Student[5];
		ar[0] = new Student(1, "rani",new Address("raipur", "jhk","83004"));
        ar[1] = new Student(2, "rajveer", new Address("goa", "MP", "4006"));
        ar[2] = new Student(3, "SHREYA", new Address("ranchi", "jh", "834001"));
        ar[3] = new Student(4, "shivani", new Address("karachi", "gujrat", "5003"));
        ar[4] = new Student(5, "rekha", new Address("kerala", "tiruvantpuram", "829106"));

        // Print the last student's details before the change
        System.out.println("Last student before address change:");
        System.out.println(ar[4]);

        // Change the last student's address data
        ar[4].address = new Address("San Francisco", "CA", "94101");

        // Print the last student's details after the change
        System.out.println("Last student after address change:");
        System.out.println(ar[4]);
    }

	}


