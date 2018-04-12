package ua.lviv.iot;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HouseManagerTest {

    /*private static final HouseDevice hoover = new Hoover(1,"H123", "LG", 1501, CleanType.DRY);
    private static final HouseDevice iron = new Iron(2,"ERY19", "Samsung", 251, SoleType.CERAMICS,
            false);
    private static final HouseDevice tv = new TV(3,"SmartHD", "LG", 780, 32.0,
            true, true);
    private static final HouseDevice microwave = new Microwave(4,"Hot007", "LG", 860,
            26.5, false);
    private static final HouseDevice air = new AirConditining(5,"WinterIsComing", "Bakura",
            890, 2.4);
    private static final HouseDevice dishwasher = new Dishwasher(6,"Bock11", "Bosch", 450,
            9, 3.4);
    private static final HouseDevice kettle = new ElectricKettle(7,"Tae21", "Bosch", 610,
            2.5);
    private static final HouseDevice stove = new ElectricStove(8,"Folk777", "Piramida", 920,
            4, true);
    private static final HouseDevice drier = new HairDrier(9,"Wind", "LG", 115, 3);
    private static final HouseDevice multitool = new Multitool(10,"BestFood", "Piramida", 690,
            5.0, 14);
    private static final HouseDevice machine = new WashingMachine(11,"C891", "LG", 540,
            31.5, 1000);
    private static final HouseDevice refrigerator = new Refrigerator(12,"MRCOLD", "Samsung",
            810, 25.6, 0.0, false);

    private static final HouseManager houseManager = new HouseManager(houseDeviceDao);
    private static final HouseDeviceWriter writer = new HouseDeviceWriter();
    private static final File file = new File("D:\\programs\\houseDevicesList.csv");
    private Map<Integer,HouseDevice> testMap = new HashMap<>();
    private List<HouseDevice> houseDeviceList = new LinkedList<>(houseManager.getHouseDeviceMap().values());
    private List<HouseDevice> testList = new LinkedList<>();

    @BeforeAll
    static void addDeviceToList() {
        houseManager.addHouseDeviceList(hoover.getId(),hoover);
        houseManager.addHouseDeviceList(iron.getId(),iron);
        houseManager.addHouseDeviceList(tv.getId(),tv);
        houseManager.addHouseDeviceList(microwave.getId(),microwave);
        houseManager.addHouseDeviceList(air.getId(),air);
        houseManager.addHouseDeviceList(dishwasher.getId(),dishwasher);
        houseManager.addHouseDeviceList(kettle.getId(),kettle);
        houseManager.addHouseDeviceList(stove.getId(),stove);
        houseManager.addHouseDeviceList(drier.getId(),drier);
        houseManager.addHouseDeviceList(multitool.getId(),multitool);
        houseManager.addHouseDeviceList(refrigerator.getId(),refrigerator);
        houseManager.addHouseDeviceList(machine.getId(),machine);
    }

    @Test
    void addHouseDeviceList() {
        assertEquals(hoover, houseManager.getHouseDeviceMap().get(1));
    }

    @Test
    public void switchOn() {
        houseManager.switchOn(1);
        assertEquals (true, houseManager.getHouseDeviceMap().get(1).getSwitched());
        houseManager.switchOn(12);
    }

    @Test
    void switchOff() {
        houseManager.switchOff(1);
        assertEquals (false, houseManager.getHouseDeviceMap().get(1).getSwitched());
        houseManager.switchOff(12);
    }

    @Test
    void consumerPower() {
        assertEquals(0, houseManager.consumerPower());
        houseManager.switchOn(1);
        int power = hoover.getPower();
        assertEquals(power, houseManager.consumerPower());
    }

    @Test
    void searchByProducer() {
        testMap = houseManager.searchByProducer(air.getProducer());
        assertEquals(1, testMap.size());
        assertEquals(air, testMap.get(air.getId()));
        testMap = houseManager.searchByProducer(stove.getProducer());
        assertEquals(2, testMap.size());
        assertEquals(stove, testMap.get(stove.getId()));
        assertEquals(multitool, testMap.get(multitool.getId()));
        testMap = houseManager.searchByProducer(" ");
        assertEquals(0, testMap.size());
    }

    @Test
    void sortByPower() {
        testList = new LinkedList<>(houseManager.sortByPower(houseDeviceList));
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

    @Test
    void writeToFileTest() {
        /*
        try {
            writer.writeToFile(houseManager.getHouseDeviceMap());
        } catch (Exception e) {
            assertTrue(false);
        }
        assertEquals(true, file.exists());

    }*/

}