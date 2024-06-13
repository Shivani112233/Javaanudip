package inheritance;

public class Laptop extends Device {
	private int batteryLife;
	
	public Laptop() {
		
	}

  
    public Laptop(String brand, String model) {
		super(brand, model);
		// TODO Auto-generated constructor stub
	}


	public Laptop(String brand, String model, int batteryLife) {
        super(brand, model);
        this.batteryLife = batteryLife;
    }

    // Method to display battery status
    public void showBatteryStatus() {
        System.out.println("Battery Life: " + batteryLife + " hours");
    }

    // Override the method to display device information
    public void displayDevice() {
        super.display();
        showBatteryStatus();
    }
}


