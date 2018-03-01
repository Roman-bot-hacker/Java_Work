package ua.lviv.iot.lab3;
public class Main {

    public static void main(final String[] args) {
        final HouseManager rob = new HouseManager();
        rob.addHouseDeviceList(new Hoover("H123", "LG", 1501, CleanType.DRY));
        rob.addHouseDeviceList(new Iron("ERY19", "Samsung", 251, SoleType.CERAMICS, false));
        rob.addHouseDeviceList(new TV("SmartHD", "LG", 780, 32.0, true, true));
        rob.addHouseDeviceList(new Microwave("Hot007", "LG", 860, 26.5, false));
        rob.addHouseDeviceList(new AirConditining("WinterIsComing", "Bakura", 890, 2.4));
        rob.addHouseDeviceList(new Dishwasher("Bock11", "Bosch", 450, 9, 3.4));
        rob.addHouseDeviceList(new ElectricKettle("Tae21", "Bosch", 610, 2.5));
        rob.addHouseDeviceList(new ElectricStove("Folk777", "Piramida", 920, 4, true));
        rob.addHouseDeviceList(new HairDrier("Wind", "LG", 115, 3));
        rob.addHouseDeviceList(new Hoover("Titan29", "Bosch", 1200, CleanType.WET));
        rob.addHouseDeviceList(new Iron("R2D2", "Philips", 310, SoleType.STEAMGLIDE, true));
        rob.addHouseDeviceList(new Microwave("BurgerF", "Piramida", 730, 21.8, true));
        rob.addHouseDeviceList(new Multitool("BestFood", "Piramida", 690, 5.0, 14));
        rob.addHouseDeviceList(new Refrigerator("MRCOLD", "Samsung", 810, 25.6, 0.0, false));
        rob.addHouseDeviceList(new TV("StupidWatch", "Philips", 550, 21.2, false, false));
        rob.addHouseDeviceList(new WashingMachine("C891", "LG", 540, 31.5, 1000));
        rob.switchOff(0);
        rob.switchOff(1);
        rob.switchOff(5);
        rob.switchOff(8);
        rob.switchOff(11);
        System.out.println("Consumer Power:\n" + rob.consumerPower());
        System.out.println("\nSearch by producer:\n" + rob.searchByProducer("LG"));
        System.out.println("Sorted by power list with found devices:\n");
        rob.sortByPower(rob.searchByProducer("LG"));
        System.out.println(rob.getHouseDeviceList().get(0).getType());
    }

}
