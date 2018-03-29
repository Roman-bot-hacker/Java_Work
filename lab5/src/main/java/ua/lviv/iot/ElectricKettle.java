package ua.lviv.iot;
public class ElectricKettle extends HouseDevice {

    private double volume;

    public ElectricKettle(final Integer id, final String name, final String producer, final int power, final double volume) {
        super(id, name, producer, power, DeviceType.ELECTRICKETTLE);
        this.volume = volume;
    }

    public final double getVolume() {
        return volume;
    }

    public final String getHeaders() {
        return super.getHeaders()+",Volume";
    }

    public final String toCSV() {
        return super.toCSV()+","+volume;
    }

}
