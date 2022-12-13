package Threado;

public class Funda {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("Abhijeet");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());

	}

}
