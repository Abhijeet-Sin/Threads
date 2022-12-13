package Threado;

public class SecondWay implements Runnable {
	protected Thread t;
	public SecondWay() {
		t=new Thread(this);
		//tt.start();
	}
	
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("hi this is the haha");
	}

}
