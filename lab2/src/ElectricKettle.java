
public class ElectricKettle extends HouseDevice {
	
	private double volume;

	public ElectricKettle(String name, String producer, int power, double volume) {
		super(name, producer, power);
		type = DeviceType.ELECTRICKETTLE;
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
}
