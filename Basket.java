package Threado;
public class Basket {
	private int fruit;
	private volatile boolean myflag = false;
	
	public synchronized int getFruit() {
		
		while (myflag == false) {
		try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	}
		
		return fruit;
}

	public synchronized void setFruit(int fruit) {
		while(myflag==true) {
		try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}  }
		
		this.fruit = fruit;
	}
	public void setflag(boolean myflag) 
	{
		this.myflag = myflag;
	}
}

