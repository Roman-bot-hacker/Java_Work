package ua.lviv.iot;
public class WashingMachine extends HouseDevice {

    private double depth;

    private double maxWeightLoad;

    public WashingMachine(final String name, final String producer, final int power, final double depth,
                          final double maxWeightLoad) {
        super(name, producer, power, DeviceType.WASHINGMACHINE);
        this.depth = depth;
        this.maxWeightLoad = maxWeightLoad;
    }

    public final double getDepth() {
        return depth;
    }

    public final void setDepth(final double depth) {
        this.depth = depth;
    }

    public final double getMaxWeightLoad() {
        return maxWeightLoad;
    }

    public final void setMaxWeightLoad(final double maxWeightLoad) {
        this.maxWeightLoad = maxWeightLoad;
    }

}
