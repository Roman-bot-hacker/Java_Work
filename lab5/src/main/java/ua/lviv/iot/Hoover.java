package ua.lviv.iot;
public class Hoover extends HouseDevice {

    private CleanType cType;

    public Hoover(final Integer id, final String name, final String producer, final int power, final CleanType cType) {
        super(id, name, producer, power, DeviceType.HOOVER);
        this.cType = cType;
    }

    public final CleanType getcType() {
        return cType;
    }

    public final String getHeaders() {
        return super.getHeaders()+",Clean Type";
    }

    public final String toCSV() {
        return super.toCSV()+","+cType;
    }

}
