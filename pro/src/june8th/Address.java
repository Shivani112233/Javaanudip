package june8th;

public class Address {
	
	private String District;
	private String State;
	
	public Address() {
		
	}

	public Address(String district, String state) {
		super();
		District = district;
		State = state;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [District=" + District + ", State=" + State + "]";
	}
	
	
	



	

		



	


	
	}
	
	


