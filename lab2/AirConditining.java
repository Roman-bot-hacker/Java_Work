
public class AirConditining extends HouseDevice {
	
	private double coldProducity;

	public AirConditining(String name, String producer, int power, double coldProducity) {
		super(name, producer, power);
		type = DeviceType.AIRCONDITINING;
		this.coldProducity = coldProducity;
	}

	public double getColdProducity() {
		return coldProducity;
	}

	public void setColdProducity(double coldProducity) {
		this.coldProducity = coldProducity;
	}
	
}
