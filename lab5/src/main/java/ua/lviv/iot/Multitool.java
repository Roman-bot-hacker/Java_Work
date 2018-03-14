package ua.lviv.iot;
public class Multitool extends HouseDevice {

    private double volume;

    private int programsNumber;

    public Multitool(final String name, final String producer, final int power, final double volume,
                     final int programsNumber) {
        super(name, producer, power, DeviceType.MULTITOOL);
        this.volume = volume;
        this.programsNumber = programsNumber;
    }

    public final double getVolume() {
        return volume;
    }

    public final int getProgramsNumber() {
        return programsNumber;
    }

    public final String getHeaders() {
        return super.getHeaders()+",Volume,Program's Number";
    }

    public final String toCSV() {
        return super.toCSV()+","+volume+","+programsNumber;
    }

}
