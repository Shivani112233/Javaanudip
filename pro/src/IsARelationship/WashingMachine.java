package IsARelationship;

public class WashingMachine extends Appliance 
{
	private int size;
	private String type;
	
	
	public void work() {
		System.out.println("WASHING THE CLOTHES");
		
		
		
	}


	public WashingMachine(int size, String type) {
		super();
		this.size = size;
		this.type = type;
	}
	
	public WashingMachine() {}


	public WashingMachine(String brandname, double price) {
		super(brandname, price);
		// TODO Auto-generated constructor stub
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "WashingMachine [size=" + size + ", type=" + type + ", getSize()=" + getSize() + ", getType()="
				+ getType() + ", getBrandname()=" + getBrandname() + ", getPrice()=" + getPrice() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	
	
	
	

}
