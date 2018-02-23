
public class WashingMachine extends HouseDevice {

	private double depth;

	private double maxWeightLoad;

	public WashingMachine(String name, String producer, int power, double depth, double maxWeightLoad) {
		super(name, producer, power, DeviceType.WASHINGMACHINE);
		this.depth = depth;
		this.maxWeightLoad = maxWeightLoad;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getMaxWeightLoad() {
		return maxWeightLoad;
	}

	public void setMaxWeightLoad(double maxWeightLoad) {
		this.maxWeightLoad = maxWeightLoad;
	}

}
