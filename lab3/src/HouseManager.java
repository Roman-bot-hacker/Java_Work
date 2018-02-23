import java.util.LinkedList;
import java.util.List;

public class HouseManager {

	private List<HouseDevice> houseDeviceList = new LinkedList<>();

	public List<HouseDevice> getHouseDeviceList() {
		return houseDeviceList;
	}

	public void addHouseDeviceList(HouseDevice newDevice) {
		houseDeviceList.add(newDevice);
	}

	public void switchOn(int devicePosition) {
		if (devicePosition < houseDeviceList.size()) {
			houseDeviceList.get(devicePosition).switchOn();
			;
		} else
			System.out.println("List does not have device with this index");
	}

	public void switchOff(int i) {
		if (i < houseDeviceList.size()) {
			houseDeviceList.get(i).switchOff();
		} else
			System.out.println("List does not have device with this index");
	}

	public double consumerPower() {
		int consumerPower = 0;
		for (HouseDevice device: houseDeviceList) {
			if (device.getSwitched()) {
				consumerPower += device.getPower();
			}
		}
		return consumerPower;
	}

	public List<HouseDevice> searchByProducer(String producer) {
		List<HouseDevice> parameterDevicesList = new LinkedList<>();
		for (HouseDevice device: houseDeviceList) {
			if (device.getProducer().equalsIgnoreCase(producer)) {
				parameterDevicesList.add(device);
			}
		}
		return parameterDevicesList;
	}

	public void SortByPower(List<HouseDevice> deviceListToSort) {
		deviceListToSort.sort((sortDevice1, sortDevice2) -> sortDevice1.getPower() - sortDevice2.getPower());
		deviceListToSort.forEach((device) -> System.out.println(device));
	}

}
