package ua.lviv.iot;
public class TV extends HouseDevice {

    private double diagonal;

    private boolean smartTvAvailable;

    private boolean tvPlasma;

    public TV(final String name, final String producer, final int power, final double diagonal,
              final boolean isSmartTvAvailable, final boolean isTvPlasma) {
        super(name, producer, power, DeviceType.TV);
        this.diagonal = diagonal;
        this.smartTvAvailable = isSmartTvAvailable;
        this.tvPlasma = isTvPlasma;
    }
/*
    public final double getDiagonal() {
        return diagonal;
    }

    public final boolean isSmartTvAvailable() {
        return smartTvAvailable;
    }

    public final boolean isTvPlasma() {
        return tvPlasma;
    }
*/
}
