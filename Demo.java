public class Demo {

	public static void main(String[] args) {
		
		Animals animal = new Animals();
		
		System.out.println(animal.getName());
		System.out.println(animal.favFood);
		
		Cats kitkat = new Cats("kitkat" , 3 ,"salmon","ball" );

		System.out.println(kitkat.getName());
		System.out.println(kitkat.getAge());
		System.out.println(kitkat.favFood);
		System.out.println(kitkat.favToy);
		
		
		
	}
	
	
	
}
