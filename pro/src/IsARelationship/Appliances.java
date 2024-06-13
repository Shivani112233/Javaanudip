package IsARelationship;

public class Appliances {
private String brandName;
	
	private double price  ;
	
	
	public void mainFunction() {
		System.out.println(" making life  easy  ");
	}


	public Appliances() {
		
	}
	public Appliances(String brandName, double price) {
		super();
		this.brandName = brandName;
		this.price = price;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Appliances [brandName=" + brandName + ", price=" + price + "]";
	}

	
	
	
	
	
	

}
