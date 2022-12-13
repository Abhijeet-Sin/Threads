package Threado;

public class FirstThread extends Thread{
	
	public FirstThread(String name) {
		super(name);
	}
	
	public FirstThread(String name, Runnable r) {
		super(r,name);
	}
	
	public FirstThread(Runnable r) {
		super(r);
	}
	
	public void run() {
		for (int i = 0; i < 5 ; i++) {
			try {
			System.out.print("Id is :"+ this.getId()+"\t");
			System.out.print("Name is :"+ this.getName()+"\t");
			System.out.print("Priority is : "+ getPriority()+"\t");
			System.out.println("count is :"+ i);
			sleep(100);}
			catch(InterruptedException ie) {}
		}
	}

}
