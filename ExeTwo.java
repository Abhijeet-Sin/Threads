package Threado;

public class ExeTwo {

	public static void main(String[] args) {
		FirstThread tt = new FirstThread(new SecondWay());
		tt.start();
		SecondWay ss =new SecondWay();
		ss.t.start();
		new SecondWay().t.start();
	}

}
