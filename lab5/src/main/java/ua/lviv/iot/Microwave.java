package ua.lviv.iot;
public class Microwave extends HouseDevice {

    private double volume;

    private boolean grillAvailable;

    public Microwave(final String name, final String producer, final int power, final double volume,
                     final boolean isGrillAvailable) {
        super(name, producer, power, DeviceType.MICROWAVE);
        this.volume = volume;
        this.grillAvailable = isGrillAvailable;
    }

    public final double getVolume() {
        return volume;
    }

    public final void setVolume(final double volume) {
        this.volume = volume;
    }

    public final boolean isGrillAvailable() {
        return grillAvailable;
    }

    public final void setGrillAvailable(final boolean isGrillAvailable) {
        this.grillAvailable = isGrillAvailable;
    }

}
