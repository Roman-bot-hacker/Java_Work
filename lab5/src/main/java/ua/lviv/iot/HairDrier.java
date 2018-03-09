package ua.lviv.iot;
public class HairDrier extends HouseDevice {

    private int speedNumber;

    public HairDrier(final String name, final String producer, final int power, final int speedNumber) {
        super(name, producer, power, DeviceType.HAIRDRIER);
        this.speedNumber = speedNumber;
    }

    public final int getSpeedNumber() {
        return speedNumber;
    }

}
