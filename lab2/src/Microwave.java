
public class Microwave extends HouseDevice {
	
	private double volume;
	
	private boolean isGrillAvailable;

	public Microwave(String name, String producer, int power, double volume, boolean isGrillAvailable) {
		super(name, producer, power);
		type = DeviceType.MICROWAVE;
		this.volume = volume;
		this.isGrillAvailable = isGrillAvailable;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public boolean isGrillAvailable() {
		return isGrillAvailable;
	}

	public void setGrillAvailable(boolean isGrillAvailable) {
		this.isGrillAvailable = isGrillAvailable;
	}
	
}
