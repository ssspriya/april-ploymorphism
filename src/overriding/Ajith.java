package overriding;

public class Ajith {
	private void act() {
		System.out.println("Ajith is an actor");
	}
	public static void main (String[] args)
	{
		Ajith a = new Ajith();
		a.act();
		Vijay v = new Vijay();
		v.act();
	
	}
}
