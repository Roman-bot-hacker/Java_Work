package ua.lviv.iot.lab3;
public class AirConditining extends HouseDevice {
    private double coldProducity;

    public AirConditining(final String name, final String producer, final int power, final double coldProducity) {
        super(name, producer, power, DeviceType.AIRCONDITINING);
        this.coldProducity = coldProducity;
    }

    public final double getColdProducity() {
        return coldProducity;
    }

    public final void setColdProducity(final double coldProducity) {
        this.coldProducity = coldProducity;
    }

}
