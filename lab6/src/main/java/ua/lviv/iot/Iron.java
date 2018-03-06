package ua.lviv.iot;
public class Iron extends HouseDevice {

    private SoleType sType;

    private boolean steamerAvailable;

    public Iron(final String name, final String producer, final int power, final SoleType sType, final boolean
            isSteamerAvailable) {
        super(name, producer, power, DeviceType.IRON);
        this.sType = sType;
        this.steamerAvailable = isSteamerAvailable;
    }
/*
    public final SoleType getsType() {
        return sType;
    }

    public final boolean isSteamerAvailable() {
        return steamerAvailable;
    }
*/
}
