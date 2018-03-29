package ua.lviv.iot;
public class Dishwasher extends HouseDevice {

    private int dishesCouplesNumber;

    private double waterVolumsPerTimes;

    public Dishwasher(final Integer id, final String name, final String producer, final int power, final int dishesCouplesNumber, final double waterVolumsPerTimes) {
        super(id, name, producer, power, DeviceType.DISHWASHER);
        this.dishesCouplesNumber = dishesCouplesNumber;
        this.waterVolumsPerTimes = waterVolumsPerTimes;
    }

    public final int getDishesCouplesNumber() {
        return dishesCouplesNumber;
    }

    public final double getWaterVolumsPerTimes() {
        return waterVolumsPerTimes;
    }

    public final String getHeaders() {
        return super.getHeaders()+",Dishes Couples Number,Water Volums Per Times";
    }

    public final String toCSV() {
        return super.toCSV()+","+dishesCouplesNumber+","+waterVolumsPerTimes;
    }

}
