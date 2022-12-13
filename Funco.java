package Threado;

public class Funco {

	public static void main(String[] args) {
		Tola toal =()->{return "hai Guys";};
		System.out.println(toal.greet());
		toal =()->{return "Balle Balle Guys";};
		System.out.println(toal.greet());
		toal =()->{return "CHill out Guys";};
		System.out.println(toal.greet());

	}

}
