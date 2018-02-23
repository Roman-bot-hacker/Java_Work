
public class Refrigerator extends HouseDevice {
private double fridgeVolume;
	
	private double freezerVolume;
	
	private boolean isFreezerAvailable;

	public Refrigerator(String name, String producer, int power, 
							double fridgeVolume, double freezerVolume, boolean isFreezerAvailable) {
		super(name, producer, power);
		type = DeviceType.REFRIGERATOR;
		this.fridgeVolume = fridgeVolume;
		this.freezerVolume = freezerVolume;
		this.isFreezerAvailable = isFreezerAvailable;
	}

	public double getFridgeVolume() {
		return fridgeVolume;
	}

	public void setFridgeVolume(double fridgeVolume) {
		this.fridgeVolume = fridgeVolume;
	}

	public double getFreezerVolume() {
		if (isFreezerAvailable) {
			return freezerVolume;
		}
		else return 0.0;
	}

	public void setFreezerVolume(double freezerVolume) {
		this.freezerVolume = freezerVolume;
	}

	public boolean isFreezerAvailable() {
		return isFreezerAvailable;
	}

	public void setFreezerAvailable(boolean isFreezerAvailable) {
		this.isFreezerAvailable = isFreezerAvailable;
	}
}
