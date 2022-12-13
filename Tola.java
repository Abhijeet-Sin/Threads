package Threado;

public interface Tola {
	
	public String greet();
	
	public static String part(String s) {
		return "What a way to begin using new features of interface"+s;
	}
	default String jump() {
		return "this is the defafult method available to all child";
	}

}
