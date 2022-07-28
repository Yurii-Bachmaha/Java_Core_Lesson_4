package homework04;

public class CoffeRobot extends Robot {

	CoffeRobot() {
		super();
		this.name = "CoffeRobot";
		this.work = "I make coffee.";
	}

	public CoffeRobot(String name, String work) {

	}

	public void work(String name, String work) {
		System.out.println("I'm a " + this.name + "–" + "I" + this.work);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "I'm a " + name + " - " + work;
	}

}