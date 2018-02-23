
public class HairDrier extends HouseDevice {
	
	private int speedNumber;

	public HairDrier(String name, String producer, int power, int speedNumber) {
		super(name, producer, power);
		type = DeviceType.HAIRDRIER;
		this.speedNumber = speedNumber;
	}

	public int getSpeedNumber() {
		return speedNumber;
	}

	public void setSpeedNumber(int speedNumber) {
		this.speedNumber = speedNumber;
	}
	
}
