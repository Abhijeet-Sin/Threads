package timo;

public class Champ {
	
	public void sample() 
	{
		System.out.println("This is sample method.... in champ");
	}

}
class Childo extends Champ{
	public void sample() 
	{
		//System.out.println("This is sample Method in Champ");
		super.sample();
	}
}
