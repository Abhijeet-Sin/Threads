package Threado;

public class Exio {

	public static void main(String[] args) {
		Tola tola =new Tola() {
			public String greet() {
				return "Hai guys"; 
			}
		};
		Tola tola2 =new Tola() {
			public String greet() {
				return "Hai guys"; 
			}
		};
		System.out.println(tola2);
		System.out.println(tola);
		System.out.println(tola.greet());
		System.out.println(tola.jump());
		System.out.println(Tola.part("What a way it is"));
	}

}
