package IsARelationship;

public class Appliance {

	private String brandname;
	private double price;
	
	public void mainfunction() {
		System.out.println("life is important");
	}
	
	public Appliance() {}

	public Appliance(String brandname, double price) {
		super();
		this.brandname = brandname;
		this.price = price;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Appliance [brandname=" + brandname + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
