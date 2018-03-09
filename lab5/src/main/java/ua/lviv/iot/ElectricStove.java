package ua.lviv.iot;
public class ElectricStove extends HouseDevice {

    private int cookingPanelsNumber;

    private boolean isOvenAvailable;

    public ElectricStove(final String name, final String producer, final int power, final int cookingPanelsNumber, final boolean isOvenAvailable) {
        super(name, producer, power, DeviceType.ELECTRICSTOVE);
        this.cookingPanelsNumber = cookingPanelsNumber;
        this.isOvenAvailable = isOvenAvailable;
    }

    public final int getCookingPanelsNumber() {
        return cookingPanelsNumber;
    }

    public final boolean getOvenAvailable() {
        return isOvenAvailable;
    }

}
