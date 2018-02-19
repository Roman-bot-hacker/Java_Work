
public class Main {
	
	public static void main(String[] args) {
		Sweets sweetsDefault = new Sweets();
		Sweets sweetsEveningKiev = new Sweets("Evening Kiev", 17, 5.50, "Roshen");
		Sweets sweetKotygoroshko = new Sweets("Kotygoroshko", 33, 6.10, "Ametyst", 15);
		
		Sweets.printStaticSum();
		System.out.println(sweetsDefault.toString());
		System.out.println(sweetsEveningKiev.toString());
		System.out.println(sweetKotygoroshko.toString());
		sweetKotygoroshko.printSum();
		

	}
}
