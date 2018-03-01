package ua.lviv.iot.lab3;
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

    public final void setVolume(final double volume) {
        this.volume = volume;
    }

    public final int getProgramsNumber() {
        return programsNumber;
    }

    public final void setProgramsNumber(final int programsNumber) {
        this.programsNumber = programsNumber;
    }

}
