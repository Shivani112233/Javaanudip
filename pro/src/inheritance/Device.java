package inheritance;

public class Device {
	
	    private String brand;
	    private String model;
	    private boolean isOn;
	    
	    
	    public Device() {
	    }

	    
	    public Device(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	        this.isOn = false; // Device is initially off
	    }

	    // Method to turn the device on
	    public void turnOn() {
	        isOn = true;
	        System.out.println(brand + " " + model + " is now On.");
	    }

	    // Method to turn the device off
	    public void turnOff() {
	        isOn = false;
	        System.out.println(brand + " " + model + " is now Off.");
	    }

	    // Method to display device information
	    public void display() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Status: " + (isOn ? "On" : "Off"));
	    }


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public String getModel() {
			return model;
		}


		public void setModel(String model) {
			this.model = model;
		}


		public boolean isOn() {
			return isOn;
		}


		public void setOn(boolean isOn) {
			this.isOn = isOn;
		}
	    
	}



