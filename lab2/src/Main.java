
public class Main {

	public static void main(String[] args) {
		HouseManager rob = new HouseManager();
		rob.setHouseDeviceList(new Hoover("H123","LG", 1500, CleanType.DRY));
		rob.setHouseDeviceList(new Iron("ERY19", "Samsung", 250, SoleType.CERAMICS, false));
		rob.setHouseDeviceList(new TV("SmartHD", "LG", 780, 32.0, true, true));
		rob.setHouseDeviceList(new Microwave("Hot007", "LG", 860, 26.5, false));
		rob.setHouseDeviceList(new AirConditining("WinterIsComing", "Bakura", 890, 2.4));
		rob.setHouseDeviceList(new Dishwasher("Bock11", "Bosch", 450, 9, 3.4));
		rob.setHouseDeviceList(new ElectricKettle("Tae21", "Bosch", 610, 2.5));
		rob.setHouseDeviceList(new ElectricStove("Folk777", "Piramida", 920, 4, true));
		rob.setHouseDeviceList(new HairDrier("Wind", "LG", 115, 3));
		rob.setHouseDeviceList(new Hoover("Titan29", "Bosch", 1200, CleanType.WET));
		rob.setHouseDeviceList(new Iron("R2D2", "Philips", 310, SoleType.STEAMGLIDE, true));
		rob.setHouseDeviceList(new Microwave("BurgerF", "Piramida", 730, 21.8, true));
		rob.setHouseDeviceList(new Multitool("BestFood", "Piramida", 690, 5.0, 14));
		rob.setHouseDeviceList(new Refrigerator("MRCOLD", "Samsung", 810, 25.6, 0.0, false));
		rob.setHouseDeviceList(new TV("StupidWatch", "Philips", 550, 21.2, false, false));
		rob.setHouseDeviceList(new WashingMachine("C891", "LG", 540, 31.5, 1000));
		int random;
		for (int i=0; i<rob.getHouseDeviceList().size(); i++) {
			random = Main.Random();
			switch(random) {
			case (0) : {
				rob.switchOff(i);
				break;
			}
			case (1) : {
				rob.switchOn(i);
				break;
			}
			}
		}
		System.out.println("Consumer Power:\n"+rob.consumerPower());
		System.out.println("\nSearch by producer:\n"+rob.searchByProducer("LG"));
		System.out.println("Sorted by power list with found devices:\n");
		rob.SortByPower(rob.searchByProducer("LG"));
	}
	
	public static int Random()
	{
	   return (int)(Math.random()) + 1;
	}

}
