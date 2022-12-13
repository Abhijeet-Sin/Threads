package Threado;

public class Buyer extends Thread{
	
	private Basket basket = null;
	
	public Buyer(String name, Basket basket) 
	{
		super(name);
		this.basket=basket;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("got Fruit from te Basket"+ basket.getFruit());
			synchronized(basket) 
			{
				this.basket.setflag(false);
				this.basket.notify();
			}
			
		}
	}
}
