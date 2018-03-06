package ua.lviv.iot;
public class Refrigerator extends HouseDevice {
    private double fridgeVolume;

    private double freezerVolume;

    private boolean freezerAvailable;

    public Refrigerator(final String name, final String producer, final int power, final double fridgeVolume,
                        final double freezerVolume, final boolean isFreezerAvailable) {
        super(name, producer, power, DeviceType.REFRIGERATOR);
        this.fridgeVolume = fridgeVolume;
        this.freezerVolume = freezerVolume;
        this.freezerAvailable = isFreezerAvailable;
    }
/*
    public final double getFridgeVolume() {
        return fridgeVolume;
    }

    public final double getFreezerVolume() {
        if (freezerAvailable) {
            return freezerVolume;
        } else {
            return 0.0;
        }
    }

    public final boolean isFreezerAvailable() {
        return freezerAvailable;
    }
    */
}
