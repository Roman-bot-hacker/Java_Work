
public class Dishwasher extends HouseDevice {
	
	private int dishesCouplesNumber;
	
	private double waterVolumsPerTimes;

	public Dishwasher(String name, String producer, int power, int dishesCouplesNumber, double waterVolumsPerTimes) {
		super(name, producer, power);
		type = DeviceType.DISHWASHER;
		this.dishesCouplesNumber = dishesCouplesNumber;
		this.waterVolumsPerTimes = waterVolumsPerTimes;
	}

	public int getDishesCouplesNumber() {
		return dishesCouplesNumber;
	}

	public void setDishesCouplesNumber(int dishesCouplesNumber) {
		this.dishesCouplesNumber = dishesCouplesNumber;
	}

	public double getWaterVolumsPerTimes() {
		return waterVolumsPerTimes;
	}

	public void setWaterVolumsPerTimes(double waterVolumsPerTimes) {
		this.waterVolumsPerTimes = waterVolumsPerTimes;
	}
	
}
