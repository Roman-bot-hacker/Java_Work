
public abstract class HouseDevice {

	private String name;

	private DeviceType type;

	private String producer;

	private Integer power;

	private boolean isSwitched = false;

	public HouseDevice(String name, String producer, int power, DeviceType deviceType) {
		super();
		this.name = name;
		type = deviceType;
		this.producer = producer;
		this.power = power;
	}

	public DeviceType getType() {
		return type;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public boolean getSwitched() {
		return isSwitched;
	}

	public void setSwitched(boolean isSwitched) {
		this.isSwitched = isSwitched;
	}

	public void switchOff() {
		this.isSwitched = false;
	}

	public void switchOn() {
		this.isSwitched = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return type + " " + producer + " " + name + " " + power;
	}

}
