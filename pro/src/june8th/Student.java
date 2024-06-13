package june8th;

public class Student {
	private String age;
	   private int marks;
	   private String roll;
	   private Address address;

	   public Student() {
	   }

	   public Student(String age, int marks, String roll) {
	      this.age = age;
	      this.marks = marks;
	      this.roll = roll;
	   }

	   public String getAge() {
	      return this.age;
	   }

	   public void setAge(String age) {
	      this.age = age;
	   }

	   public int getMarks() {
	      return this.marks;
	   }

	   public void setMarks(int marks) {
	      this.marks = marks;
	   }

	   public String getRoll() {
	      return this.roll;
	   }

	   public void setRoll(String roll) {
	      this.roll = roll;
	   }

	   public Address getAddress() {
	      return this.address;
	   }

	   public void setAddress(Address address) {
	      this.address = address;
	   }

	   public String toString() {
	      return "Student [age=" + this.age + ", marks=" + this.marks + ", roll=" + this.roll + "]";
	   }
	}



