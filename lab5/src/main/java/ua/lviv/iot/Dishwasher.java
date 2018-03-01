package ua.lviv.iot;
public class Dishwasher extends HouseDevice {

    private int dishesCouplesNumber;

    private double waterVolumsPerTimes;

    public Dishwasher(final String name, final String producer, final int power, final int dishesCouplesNumber, final double waterVolumsPerTimes) {
        super(name, producer, power, DeviceType.DISHWASHER);
        this.dishesCouplesNumber = dishesCouplesNumber;
        this.waterVolumsPerTimes = waterVolumsPerTimes;
    }

    public final int getDishesCouplesNumber() {
        return dishesCouplesNumber;
    }

    public final void setDishesCouplesNumber(final int dishesCouplesNumber) {
        this.dishesCouplesNumber = dishesCouplesNumber;
    }

    public final double getWaterVolumsPerTimes() {
        return waterVolumsPerTimes;
    }

    public final void setWaterVolumsPerTimes(final double waterVolumsPerTimes) {
        this.waterVolumsPerTimes = waterVolumsPerTimes;
    }

}
