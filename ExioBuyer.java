package Threado;

public class ExioBuyer {

	public static void main(String[] args) {
		Basket basket = new Basket();
		Thread farmer = new Farmer("Farmer",basket);
		Thread buyer = new Buyer ("Buyer",basket);
		
		try {
			farmer.join();
			buyer.join();
			farmer.start();
			buyer.start();
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	
	}

}
