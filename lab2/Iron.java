
public class Iron extends HouseDevice {
	
	private SoleType sType;
	
	private boolean isSteamerAvailable;

	public Iron(String name, String producer, int power, SoleType sType, 
					boolean isSteamerAvailable) {
		super(name, producer, power);
		type = DeviceType.IRON;
		this.sType = sType;
		this.isSteamerAvailable = isSteamerAvailable;
	}

	public SoleType getsType() {
		return sType;
	}

	public void setsType(SoleType sType) {
		this.sType = sType;
	}

	public boolean isSteamerAvailable() {
		return isSteamerAvailable;
	}

	public void setSteamerAvailable(boolean isSteamerAvailable) {
		this.isSteamerAvailable = isSteamerAvailable;
	}
	
}
