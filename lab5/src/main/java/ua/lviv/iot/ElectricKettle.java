package ua.lviv.iot;
public class ElectricKettle extends HouseDevice {

    private double volume;

    public ElectricKettle(final String name, final String producer, final int power, final double volume) {
        super(name, producer, power, DeviceType.ELECTRICKETTLE);
        this.volume = volume;
    }

    public final double getVolume() {
        return volume;
    }

    public final void setVolume(final double volume) {
        this.volume = volume;
    }

}
