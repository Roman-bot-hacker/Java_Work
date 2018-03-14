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

    public final SoleType getsType() {
        return sType;
    }

    public final boolean isSteamerAvailable() {
        return steamerAvailable;
    }

    public final String getHeaders() {
        return super.getHeaders()+",Sole Type,Steamer Available";
    }

    public final String toCSV() {
        return super.toCSV()+","+sType+","+steamerAvailable;
    }

}
