package Threado;

public class Farmer extends Thread{
	
	private Basket basket = null;
	
	public Farmer(String name, Basket basket) 
	{
		super(name);
		this.basket=basket;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			basket.setFruit(i);
			System.out.println("Set Frit into the Basket"+ i);
			synchronized(basket) {
				this.basket.setflag(true);
				this.basket.notify();
			}	
		}
	}
}
