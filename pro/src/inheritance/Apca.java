package inheritance;

public class Apca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Refrigerator fridge = new Refrigerator("Samsung", 150, 300);
        fridge.turnOn();
        fridge.setTemperature(2);
        fridge.displayApplianceInfo();
        fridge.turnOff();

        System.out.println();

        // Create an instance of Oven
        Oven oven = new Oven("LG", 2000, 250);
        oven.turnOn();
        oven.setTemperature(180);
        oven.displayApplianceInfo();
        oven.turnOff();
    }

	}

