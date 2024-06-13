package IsARelationship;

public class Telivision extends Appliances {

     private int size ;
	
	 private String loudness ;
	
	
	public void changeChanel() {
		
		System.out.println(" chanel has been changed ");
		
	}
	
	public Telivision() {}

	public Telivision(int size, String loudness) {
		super();
		this.size = size;
		this.loudness = loudness;
	}

	public Telivision(String brandName, double price,int size, String loudness) {
		super(brandName, price);
		this.size = size;
		this.loudness = loudness;
		// TODO Auto-generated constructor stub
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getLoudness() {
		return loudness;
	}

	public void setLoudness(String loudness) {
		this.loudness = loudness;
	}

	@Override
	public String toString() {
		return "Telivision [size=" + size + ", loudness=" + loudness + ", getSize()=" + getSize() + ", getLoudness()="
				+ getLoudness() + ", getBrandName()=" + getBrandName() + ", getPrice()=" + getPrice() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
}
