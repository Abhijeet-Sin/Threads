package timo;

class One{}

class Two extends One{}

class Three extends Two{}

class Standalone {}

interface Mine{}

class Dumbo extends Standalone{}

class Jumbo extends Dumbo implements Mine{}

class First extends Three implements Mine{}

public class Puritan {
	
	public static void some (Standalone s) {
		
		System.out.println(s+ " This is the Value inside me and i will only print if i am instance of Mine\n");
		
		if (s instanceof Mine)
		{
			System.out.println(s+ "This is me Printing\n");
			
		}else {
			System.out.println("This is not me doesn't Print Anything.....\n");
		}
	}

	public static void main(String[] args) {
		
		One one = new Three();
		
		System.out.println(one);
		
		one= new First();
		
		System.out.println(one);
		
		Mine me = (Mine) one;
		
		System.out.println(me);
		
		//One samp =(one) new
		//Mine mew=(Mine) new Standalone();
		
		Mine mew =(Mine) me;
		
		System.out.println(mew);
		
		Standalone alo[] = {new Dumbo(), new Jumbo(), new Standalone()};
		for(Standalone see:alo) 
		{
			some(see);
		}
		
		Standalone alo1[] = { new Jumbo(), new Standalone(),new Dumbo()};
		for(Standalone see:alo1) 
		{
			some(see);
		}
		

	}

}
