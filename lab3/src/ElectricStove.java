
public class ElectricStove extends HouseDevice {

	private int cookingPanelsNumber;

	private boolean isOvenAvailable;

	public ElectricStove(String name, String producer, int power, int cookingPanelsNumber, boolean isOvenAvailable) {
		super(name, producer, power, DeviceType.ELECTRICSTOVE);
		this.cookingPanelsNumber = cookingPanelsNumber;
		this.isOvenAvailable = isOvenAvailable;
	}

	public int getCookingPanelsNumber() {
		return cookingPanelsNumber;
	}

	public void setCookingPanelsNumber(int cookingPanelsNumber) {
		this.cookingPanelsNumber = cookingPanelsNumber;
	}

	public boolean isOvenAvailable() {
		return isOvenAvailable;
	}

	public void setOvenAvailable(boolean isOvenAvailable) {
		this.isOvenAvailable = isOvenAvailable;
	}

}
