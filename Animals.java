
public class Animals extends Demised implements Species {

	private String name = "Animal";
	private int age = 0;
	public String favFood = "Food";

	protected final void changeName(String newName) {

		this.name = newName;

	}

	public String getName() {

		return this.name;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public int getAge() {

		return this.age;
	}

	public void eatStuff() {

		System.out.println("Yum" + favFood);

	}

	public void walkAround() {

		System.out.println(this.name + "walks around");
	}

	public Animals() {

	}

	public Animals(String name, int age, String favFood) {

		this.changeName(name);
		this.setAge(age);
		this.favFood = favFood;

	}

}
