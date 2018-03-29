package ua.lviv.iot;
public class WashingMachine extends HouseDevice {

    private double depth;

    private double maxWeightLoad;

    public WashingMachine(final Integer id, final String name, final String producer, final int power, final double depth,
                          final double maxWeightLoad) {
        super(id, name, producer, power, DeviceType.WASHINGMACHINE);
        this.depth = depth;
        this.maxWeightLoad = maxWeightLoad;
    }

    public final double getDepth() {
        return depth;
    }

    public final double getMaxWeightLoad() {
        return maxWeightLoad;
    }

    public final String getHeaders() {
        return super.getHeaders()+",Depth,Max Weight Load";
    }

    public final String toCSV() {
        return super.toCSV()+","+depth+","+maxWeightLoad;
    }

}
