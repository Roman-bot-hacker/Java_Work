
public class Multitool extends HouseDevice {

	private double volume;

	private int programsNumber;

	public Multitool(String name, String producer, int power, double volume, int programsNumber) {
		super(name, producer, power, DeviceType.MULTITOOL);
		this.volume = volume;
		this.programsNumber = programsNumber;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getProgramsNumber() {
		return programsNumber;
	}

	public void setProgramsNumber(int programsNumber) {
		this.programsNumber = programsNumber;
	}

}
