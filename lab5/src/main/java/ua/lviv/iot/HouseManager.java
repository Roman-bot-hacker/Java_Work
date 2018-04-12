package ua.lviv.iot;
import ua.lviv.iot.persistence.dao.HouseDeviceDao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Dependent
public class HouseManager implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    public HouseDeviceDao houseDeviceDao;

    private static Map<Integer, HouseDevice> houseDeviceMap =new HashMap<>();

    public HouseManager() {

    }

    public final Map<Integer, HouseDevice> getHouseDeviceMap() {
        return houseDeviceMap;
    }

    public HouseDevice getHouseDevice(Integer id) {
         return houseDeviceDao.findById(id);
    }

    public void addHouseDevice(HouseDevice device) {
        houseDeviceDao.persist(device);
    }

    public  void updateHouseDevice(HouseDevice device) {
        houseDeviceDao.update(device);
    }

    public  void deleteHouseDevice(Integer id) {
        houseDeviceDao.delete(id);
    }

    public final void switchOn(final int devicePosition) {
       if ((devicePosition< houseDeviceMap.size())&&(devicePosition>=0)) {
            houseDeviceMap.get(devicePosition).switchOn();
        }
        else {
            System.out.println("List does not have device with this index");
        }
    }

    public final void switchOff(final int devicePosition) {
        if (devicePosition < houseDeviceMap.size()) {
            houseDeviceMap.get(devicePosition).switchOff();
        } else {
            System.out.println("List does not have device with this index");
        }
    }

    public final int consumerPower() {
        int consumerPower = 0;
        for (Map.Entry<Integer,HouseDevice> houseDevice: houseDeviceMap.entrySet()) {
            if (houseDevice.getValue().getSwitched()) {
                consumerPower += houseDevice.getValue().getPower();
            }
        }
        return consumerPower;
    }

    public final Map<Integer,HouseDevice> searchByProducer(final String producer) {
        final Map<Integer,HouseDevice> parameterDevicesList = new HashMap<>();
        for (Map.Entry<Integer,HouseDevice> houseDevice: houseDeviceMap.entrySet()) {
            if (houseDevice.getValue().getProducer().equalsIgnoreCase(producer)) {
                parameterDevicesList.put(houseDevice.getKey(),houseDevice.getValue());
            }
        }
        return parameterDevicesList;
    }

    public final List<HouseDevice> sortByPower(final List<HouseDevice> deviceMapToSort) {
        deviceMapToSort.sort((sortDevice1, sortDevice2) -> sortDevice1.getPower() - sortDevice2.getPower());
        deviceMapToSort.forEach((device) -> System.out.println(device));
        return deviceMapToSort;
    }

}
