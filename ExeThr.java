package Threado;

public class ExeThr {

	public static void main(String[] args) {
		FirstThread tt = new FirstThread("Dimple");
		tt.start();
		FirstThread tt2 = new FirstThread("Dimple2");
		tt2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I am over he main here exiting.......");
	}

}
