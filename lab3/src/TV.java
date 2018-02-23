
public class TV extends HouseDevice {

	private double diagonal;

	private boolean isSmartTvAvailable;

	private boolean isTvPlasma;

	public TV(String name, String producer, int power, double diagonal, boolean isSmartTvAvailable,
			boolean isTvPlasma) {
		super(name, producer, power, DeviceType.TV);
		this.diagonal = diagonal;
		this.isSmartTvAvailable = isSmartTvAvailable;
		this.isTvPlasma = isTvPlasma;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public boolean isSmartTvAvailable() {
		return isSmartTvAvailable;
	}

	public void setSmartTvAvailable(boolean isSmartTvAvailable) {
		this.isSmartTvAvailable = isSmartTvAvailable;
	}

	public boolean isTvPlasma() {
		return isTvPlasma;
	}

	public void setTvPlasma(boolean isTvPlasma) {
		this.isTvPlasma = isTvPlasma;
	}

}
