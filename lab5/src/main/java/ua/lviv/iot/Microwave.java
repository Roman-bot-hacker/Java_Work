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

    public final boolean isGrillAvailable() {
        return grillAvailable;
    }

    public final String getHeaders() {
        return super.getHeaders()+",Volume,Grill Available";
    }

    public final String toCSV() {
        return super.toCSV()+","+volume+","+grillAvailable;
    }

}
