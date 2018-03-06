package ua.lviv.iot;
import java.util.LinkedList;
import java.util.List;

public class HouseManager {

    private List<HouseDevice> houseDeviceList = new LinkedList<>();

    public final List<HouseDevice> getHouseDeviceList() {
        return houseDeviceList;
    }

    public final void addHouseDeviceList(final HouseDevice newDevice) {
        houseDeviceList.add(newDevice);
    }

    public final void switchOn(final int devicePosition) {
       if ((devicePosition<houseDeviceList.size())&&(devicePosition>=0)) {
            houseDeviceList.get(devicePosition).switchOn();
        }
        else {
            System.out.println("List does not have device with this index");
        }
    }

    public final void switchOff(final int devicePosition) {
        if (devicePosition < houseDeviceList.size()) {
            houseDeviceList.get(devicePosition).switchOff();
        } else {
            System.out.println("List does not have device with this index");
        }
    }

    public final int consumerPower() {
        int consumerPower = 0;
        for (final HouseDevice device: houseDeviceList) {
            if (device.getSwitched()) {
                consumerPower += device.getPower();
            }
        }
        return consumerPower;
    }

    public final List<HouseDevice> searchByProducer(final String producer) {
        final List<HouseDevice> parameterDevicesList = new LinkedList<>();
        for (final HouseDevice device: houseDeviceList) {
            if (device.getProducer().equalsIgnoreCase(producer)) {
                parameterDevicesList.add(device);
            }
        }
        return parameterDevicesList;
    }

    public final List<HouseDevice> sortByPower(final List<HouseDevice> deviceListToSort) {
        deviceListToSort.sort((sortDevice1, sortDevice2) -> sortDevice1.getPower() - sortDevice2.getPower());
        deviceListToSort.forEach((device) -> System.out.println(device));
        return deviceListToSort;
    }

}
