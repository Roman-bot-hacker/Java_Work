
public class Sweets {

	// Weight of sweets, which is available for a shop by default
	private static final double DEF_WEIGHT = 1.0;

	// Price per 1 KG of sweets by default
	private static final double DEF_PRICE = 100.0;

	// Number of sweets per 1 KG by default
	private static final int DEF_NUMBER = 50;

	// Summary price of sweets
	private static double sumPrice = 0;

	private int numberByKg;

	private double availiableWeight;

	private double priceByKg;

	private String name;

	private String producer;

	public Sweets() {
		numberByKg = DEF_NUMBER;
		name = "Name";
		priceByKg = DEF_PRICE;
		producer = "Producer";
		availiableWeight = DEF_WEIGHT;
		sumPrice += (priceByKg * availiableWeight);
	}

	public Sweets(String name, int numberByKg, double priceByKg, String producer) {
		this.numberByKg = numberByKg;
		this.name = name;
		this.priceByKg = priceByKg;
		this.producer = producer;
		availiableWeight = DEF_WEIGHT;
		sumPrice += (priceByKg * availiableWeight);
	}

	public Sweets(String name, int numberByKg, double priceByKg, String producer,
			double availiableWeight) {
		this.numberByKg = numberByKg;
		this.name = name;
		this.priceByKg = priceByKg;
		this.producer = producer;
		this.availiableWeight = availiableWeight;
		sumPrice += (priceByKg * availiableWeight);
	}

	public int getWeight() {
		return numberByKg;
	}

	public void setWeight(int numberByKg) {
		this.numberByKg = numberByKg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return priceByKg;
	}

	public void setPrice(double priceByKg) {
		sumPrice -= (priceByKg * availiableWeight);
		this.priceByKg = priceByKg;
		sumPrice += (priceByKg * availiableWeight);
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getAvailiableWeight() {
		return availiableWeight;
	}

	public void setAvailiableWeight(double availiableWeight) {
		sumPrice += (priceByKg * availiableWeight);
		this.availiableWeight = availiableWeight;
		sumPrice += (priceByKg * availiableWeight);
	}

	public String toString() {
		return "\nSweet " + name + ":\n" + "Number of sweets by 1 KG: " + numberByKg + "\n"
				+ "Price by 1 KG of sweets (in UAH): " + priceByKg + "\n"
				+ "Producer: " + producer + "\n"
				+ "Weight of sweets, which are availiable in a shop: " 
				+ availiableWeight + "\n";
	}

	public static void printStaticSum() {
		System.out.println("\nSummury Weight of Sweets is " + sumPrice);
	}

	public void printSum() {
		System.out.println("\nSummury Weight of Sweets is " + Sweets.sumPrice);
	}

	public void resetValues(String name, int numberByKg, double priceByKg, 
			String producer, double availiableWeight) {
		sumPrice += (priceByKg * availiableWeight);
		this.name = name;
		this.numberByKg = numberByKg;
		this.priceByKg = priceByKg;
		this.producer = producer;
		this.availiableWeight = availiableWeight;
		sumPrice += (priceByKg * availiableWeight);
	}

}
