
public class Hoover extends HouseDevice {

	private CleanType cType;

	public Hoover(String name, String producer, int power, CleanType cType) {
		super(name, producer, power, DeviceType.HOOVER);
		this.cType = cType;
	}

	public CleanType getcType() {
		return cType;
	}

	public void setcType(CleanType cType) {
		this.cType = cType;
	}

}
