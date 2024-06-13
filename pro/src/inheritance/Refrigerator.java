package inheritance;

public class Refrigerator extends Appliance {

	private int capacity; // in liters
    private int temperature;

    // Constructor
    public Refrigerator(String brand, int powerConsumption, int capacity) {
        super(brand, powerConsumption);
        this.capacity = capacity;
        this.temperature = 4; // Default temperature in Celsius
    }

    

    public int getCapacity() {
		return capacity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public int getTemperature() {
		return temperature;
	}
	
	
	public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Refrigerator temperature set to " + temperature + "°C.");
    }




	// Method to display the temperature
    public void displayTemperature() {
        System.out.println("Refrigerator temperature: " + temperature + "°C.");
    }
   
 // Override the method to display appliance information
 	public void displayApplianceInfo() {
         super.displayApplianceInfo();
         System.out.println("Capacity: " + capacity + " liters");
         displayTemperature();
     }
    



	@Override
	public String toString() {
		return "Refrigerator [capacity=" + capacity + ", temperature=" + temperature + ", getCapacity()="
				+ getCapacity() + ", getTemperature()=" + getTemperature() + ", getBrand()=" + getBrand()
				+ ", getPowerConsumption()=" + getPowerConsumption() + ", isOn()=" + isOn() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

    
}


