package inheritance;

public class Oven extends Appliance{
	
	    private int maxTemperature;
	    private int currentTemperature;
	    
	    //default
	    public Oven() {
	    	
	    }

	    //parametrize
	    public Oven(String brand, int powerConsumption, int maxTemperature) {
	        super(brand, powerConsumption);
	        this.maxTemperature = maxTemperature;
	        this.currentTemperature = 0; // Oven is initially off, so temperature is 0
	    }
	    

	    public int getMaxTemperature() {
			return maxTemperature;
		}

		public void setMaxTemperature(int maxTemperature) {
			this.maxTemperature = maxTemperature;
		}

		public int getCurrentTemperature() {
			return currentTemperature;
		}

		public void setCurrentTemperature(int currentTemperature) {
			this.currentTemperature = currentTemperature;
		}

		// Method to set the temperature
	    public void setTemperature(int temperature) {
	        if (temperature <= maxTemperature) {
	            this.currentTemperature = temperature;
	            System.out.println("Oven temperature set to " + temperature + "°C.");
	        } else {
	            System.out.println("Temperature exceeds maximum limit of " + maxTemperature + "°C.");
	        }
	    }

	    // Method to display the temperature
	    public void displayTemperature() {
	        System.out.println("Oven current temperature: " + currentTemperature + "°C.");
	    }

	    // Override the method to display appliance information
	    @Override
	    public void displayApplianceInfo() {
	        super.displayApplianceInfo();
	        System.out.println("Max Temperature: " + maxTemperature + "°C");
	        displayTemperature();
	    }

		
	    
	}


