
public class Cats extends Animals {

	public String favToy ="Yarn" ;
	
	public void playWith() {
		System.out.println("yeah"  + favToy);
	}
	
	public void walkAround() {
		
		System.out.println(this.getName() + "running around");
	}
	
	public String getToy() {
		
		return this.favToy;
	}
	
	public Cats() {
		
	}
	
	public Cats (String name, int age ,String favFood, String favToy) {
		
		super(name, age ,favFood);
		this.favToy = favToy;
		
	}
	
}
