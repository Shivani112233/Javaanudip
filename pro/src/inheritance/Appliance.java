package inheritance;

public class Appliance {
		 private String brand;
		 private int powerConsumption;
		 private boolean isOn;
		 
		 public Appliance() {
			 
		 }
	
		    //  parametrize Constructor
		    public Appliance(String brand, int powerConsumption) {
		    this.brand = brand;
		        this.powerConsumption = powerConsumption;
		        this.isOn = false; // Appliance is initially off
		    }
	
		    // Method to display appliance information
		    public void displayApplianceInfo() {
		        System.out.println("Brand: " + brand);
		        System.out.println("Power Consumption: " + powerConsumption + " volt");
		        System.out.println("Status: " + (isOn ? "On" : "Off"));//ternary operator
		    }
	
		    // Method to turn the appliance on
		    public void turnOn() {
		        isOn = true;
		        System.out.println(brand + " appliance is now On.");
		    }
	
		    // Method to turn the appliance off
		    public void turnOff() {
		        isOn = false;
		        System.out.println(brand + " appliance is now Off.");
		    }

			public String getBrand() {
				return brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}

			public int getPowerConsumption() {
				return powerConsumption;
			}

			public void setPowerConsumption(int powerConsumption) {
				this.powerConsumption = powerConsumption;
			}

			public boolean isOn() {
				return isOn;
			}

			public void setOn(boolean isOn) {
				this.isOn = isOn;
			}

			@Override
			public String toString() {
				return "Appliance [brand=" + brand + ", powerConsumption=" + powerConsumption + ", isOn=" + isOn + "]";
			}
		    
		    
		}




