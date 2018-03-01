package ua.lviv.iot.lab3;
public class Iron extends HouseDevice {

    private SoleType sType;

    private boolean steamerAvailable;

    public Iron(final String name, final String producer, final int power, final SoleType sType, final boolean
            isSteamerAvailable) {
        super(name, producer, power, DeviceType.IRON);
        this.sType = sType;
        this.steamerAvailable = isSteamerAvailable;
    }

    public final SoleType getsType() {
        return sType;
    }

    public final void setsType(final SoleType sType) {
        this.sType = sType;
    }

    public final boolean isSteamerAvailable() {
        return steamerAvailable;
    }

    public final void setSteamerAvailable(final boolean isSteamerAvailable) {
        this.steamerAvailable = isSteamerAvailable;
    }

}
