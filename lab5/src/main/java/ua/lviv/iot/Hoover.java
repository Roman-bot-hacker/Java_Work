package ua.lviv.iot;
public class Hoover extends HouseDevice {

    private CleanType cType;

    public Hoover(final String name, final String producer, final int power, final CleanType cType) {
        super(name, producer, power, DeviceType.HOOVER);
        this.cType = cType;
    }

    public final CleanType getcType() {
        return cType;
    }

    public final void setcType(final CleanType cType) {
        this.cType = cType;
    }

}
