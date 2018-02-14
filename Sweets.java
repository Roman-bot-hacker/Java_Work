
public class Sweets {
	
	private int OnesWeight;
	private String Name;
	private double OnesPrice;
	private String Producer;
	private int Number;
	private static int SumWeight = 0;
	
	Sweets() {
		OnesWeight = 20;
		Name = "King's charm";
		OnesPrice = 4.40;
		Producer = "AVK";
		Number = 30;
		SumWeight += (OnesWeight*Number);
	}
	
	Sweets (String Name, int OnesWeight, double OnesPrice, String Producer){
		this.OnesWeight = OnesWeight;
		this.Name = Name;
		this.OnesPrice = OnesPrice;
		this.Producer = Producer;
		Number = 30;
		SumWeight += (OnesWeight*Number);
	}
	
	Sweets (String Name, int OnesWeight, double OnesPrice, String Producer, int Number){
		this.OnesWeight = OnesWeight;
		this.Name = Name;
		this.OnesPrice = OnesPrice;
		this.Producer = Producer;
		this.Number = Number;
		SumWeight += (OnesWeight*Number);
	}
	
	public int GetWeight() {
		return OnesWeight;
	}
	
	public void SetWeight(int OnesWeight) {
		SumWeight -= (this.OnesWeight*Number);
		this.OnesWeight=OnesWeight;
		SumWeight += (OnesWeight*Number);
	}
	
	public String GetType() {
		return Name;
	}
	public void SetType(String Type) {
		this.Name=Type;
	}
	
	public double GetPrice() {
		return OnesPrice;
	}
	
	public void SetPrice(double OnesPrice) {
		this.OnesPrice=OnesPrice;
	}
	
	public String GetProducer() {
		return Producer;
	}
	
	public void SetProducer(String Producer) {
		this.Producer=Producer;
	}
	
	public int GetNumber() {
		return Number;
	}
	
	public void SetNumber(int Number) {
		SumWeight -= (OnesWeight*this.Number);
		this.Number=Number;
		SumWeight += (OnesWeight*Number);
	}
	
	public void ToString() {
		System.out.println("\nSweet "+Name+":");
		System.out.println("Weight by One (in grams): "+OnesWeight);
		System.out.println("Price by One (in UAH): "+OnesPrice);
		System.out.println("Producer: "+Producer);
		System.out.println("Number: "+Number);
	}
	
	public static void PrintStaticSum() {
		System.out.println("\nSummury Weight of Sweets is "+SumWeight);
	}
	
	public void PrintSum() {
		System.out.println("\nSummury Weight of Sweets is "+Sweets.SumWeight);
	}
	
	public void ResetValues(String Name, int OnesWeight, double OnesPrice, String Producer, int Number) {
		SumWeight -= (this.OnesWeight*this.Number);
		this.Name=Name;
		this.OnesWeight=OnesWeight;
		this.OnesPrice=OnesPrice;
		this.Producer=Producer;
		this.Number=Number;
		SumWeight += (this.OnesWeight*this.Number);
	}

	public static void main(String[] args) {
		Sweets sweet1 = new Sweets();
		Sweets sweet2 = new Sweets("Evening Kiev", 17, 5.50, "Roshen");
		Sweets sweet3 = new Sweets("Kotygoroshko", 33, 6.10, "Ametyst", 15);
		
		Sweets.PrintStaticSum();
		sweet1.ToString();
		sweet2.ToString();
		sweet3.ToString();
		sweet3.PrintSum();
		

	}

}
