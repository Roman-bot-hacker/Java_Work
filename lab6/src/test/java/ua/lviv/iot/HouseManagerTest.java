package ua.lviv.iot;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HouseManagerTest {

    private static final HouseDevice hoover = new Hoover("H123", "LG", 1501, CleanType.DRY);
    private static final HouseDevice iron = new Iron("ERY19", "Samsung", 251, SoleType.CERAMICS,
            false);
    private static final HouseDevice tv = new TV("SmartHD", "LG", 780, 32.0,
            true, true);
    private static final HouseDevice microwave = new Microwave("Hot007", "LG", 860,
            26.5, false);
    private static final HouseDevice air = new AirConditining("WinterIsComing", "Bakura",
            890, 2.4);
    private static final HouseDevice dishwasher = new Dishwasher("Bock11", "Bosch", 450,
            9, 3.4);
    private static final HouseDevice kettle = new ElectricKettle("Tae21", "Bosch", 610,
            2.5);
    private static final HouseDevice stove = new ElectricStove("Folk777", "Piramida", 920,
            4, true);
    private static final HouseDevice drier = new HairDrier("Wind", "LG", 115, 3);
    private static final HouseDevice multitool = new Multitool("BestFood", "Piramida", 690,
            5.0, 14);
    private static final HouseDevice machine = new WashingMachine("C891", "LG", 540,
            31.5, 1000);
    private static final HouseDevice refrigerator = new Refrigerator("MRCOLD", "Samsung",
            810, 25.6, 0.0, false);
    private static final HouseManager houseManager = new HouseManager();
    private List<HouseDevice> testList = new LinkedList<>();

    @BeforeAll
    static void addDeviceToList() {
        houseManager.addHouseDeviceList(hoover);
        houseManager.addHouseDeviceList(iron);
        houseManager.addHouseDeviceList(tv);
        houseManager.addHouseDeviceList(microwave);
        houseManager.addHouseDeviceList(air);
        houseManager.addHouseDeviceList(dishwasher);
        houseManager.addHouseDeviceList(kettle);
        houseManager.addHouseDeviceList(stove);
        houseManager.addHouseDeviceList(drier);
        houseManager.addHouseDeviceList(multitool);
        houseManager.addHouseDeviceList(refrigerator);
        houseManager.addHouseDeviceList(machine);
    }

    @Test
    void addHouseDeviceList() {
        assertEquals(hoover, houseManager.getHouseDeviceList().get(0));
    }

    @Test
    public void switchOn() {
        houseManager.switchOn(0);
        assertEquals (true, houseManager.getHouseDeviceList().get(0).getSwitched());
        houseManager.switchOn(12);
    }

    @Test
    void switchOff() {
        houseManager.switchOff(0);
        assertEquals (false, houseManager.getHouseDeviceList().get(0).getSwitched());
        houseManager.switchOff(12);
    }

    @Test
    void consumerPower() {
        assertEquals(0, houseManager.consumerPower());
        houseManager.switchOn(0);
        int power = hoover.getPower();
        assertEquals(power, houseManager.consumerPower());
    }

    @Test
    void searchByProducer() {
        testList = houseManager.searchByProducer(air.getProducer());
        assertEquals(1, testList.size());
        assertEquals(air, testList.get(0));
        testList = houseManager.searchByProducer(stove.getProducer());
        assertEquals(2, testList.size());
        assertEquals(stove, testList.get(0));
        assertEquals(multitool, testList.get(1));
        testList = houseManager.searchByProducer(" ");
        assertEquals(0, testList.size());
    }

    @Test
    void sortByPower() {
        testList = houseManager.sortByPower(houseManager.getHouseDeviceList());
        assertEquals(12, testList.size());
        assertEquals(drier, testList.get(0));
        assertEquals(iron, testList.get(1));
        assertEquals(dishwasher, testList.get(2));
        assertEquals(machine, testList.get(3));
        assertEquals(kettle, testList.get(4));
        assertEquals(multitool, testList.get(5));
        assertEquals(tv, testList.get(6));
        assertEquals(refrigerator, testList.get(7));
        assertEquals(microwave, testList.get(8));
        assertEquals(air, testList.get(9));
        assertEquals(stove, testList.get(10));
        assertEquals(hoover, testList.get(11));
    }
}