package ua.lviv.iot;
public class ElectricStove extends HouseDevice {

    private int cookingPanelsNumber;

    private boolean isOvenAvailable;

    public ElectricStove(final Integer id, final String name, final String producer, final int power, final int cookingPanelsNumber, final boolean isOvenAvailable) {
        super(id, name, producer, power, DeviceType.ELECTRICSTOVE);
        this.cookingPanelsNumber = cookingPanelsNumber;
        this.isOvenAvailable = isOvenAvailable;
    }

    public final int getCookingPanelsNumber() {
        return cookingPanelsNumber;
    }

    public final boolean getOvenAvailable() {
        return isOvenAvailable;
    }

    public final String getHeaders() {
        return super.getHeaders()+",Cooking Pane ls Number,Is Oven Available";
    }

    public final String toCSV() {
        return super.toCSV()+","+cookingPanelsNumber+","+isOvenAvailable;
    }

}
