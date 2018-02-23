import java.util.LinkedList;
import java.util.List;

public class HouseManager {
	
	private List<HouseDevice> houseDeviceList = new LinkedList<>();

	public List<HouseDevice> getHouseDeviceList() {
		return houseDeviceList;
	}

	public void setHouseDeviceList(HouseDevice newDevice) {
		houseDeviceList.add(newDevice);
	}

	public void switchOn(int i) {
		if (i<houseDeviceList.size()) {
			houseDeviceList.get(i).setSwitched(true);
		}
		else System.out.println("List does not have device with this index");
	}
	
	public void switchOff(int i) {
		if (i<houseDeviceList.size()) {
			houseDeviceList.get(i).setSwitched(false);
		}
		else System.out.println("List does not have device with this index");
	}
	
	public double consumerPower() {
		int consumerPower = 0;
		for(int i=0; i < houseDeviceList.size(); i++) {
			if (houseDeviceList.get(i).getSwitched()==true) {
				consumerPower+=houseDeviceList.get(i).getPower();
			}
		}
		return consumerPower;
	}
	
	public List<HouseDevice> searchByProducer(String producer) {
		List<HouseDevice> parameterDevicesList = new LinkedList<>();
		for(int i=0; i < houseDeviceList.size(); i++) {
			if (houseDeviceList.get(i).getProducer().equalsIgnoreCase(producer)) {
				parameterDevicesList.add(houseDeviceList.get(i));
			}
		}
		return parameterDevicesList;
	}
	
	public void SortByPower(List<HouseDevice> deviceListToSort) {
		deviceListToSort.sort((sortDevice1, sortDevice2) ->  sortDevice1.getPower() - sortDevice2.getPower());
		deviceListToSort.forEach((device)->System.out.println(device));
	}
}
