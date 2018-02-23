
public abstract class HouseDevice {
	
	protected String name;
	
	protected DeviceType type;
	
	protected String producer;
	
	protected Integer power;
	
	protected boolean isSwitched = false;
	
	protected HouseDevice(String name, String producer, int power) {
		super();
		this.name = name;
		type = DeviceType.OTHER;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return type+" "+name;
	}
		
}
