package homework04;

public class RobotDancer extends Robot {

	RobotDancer() {
		super();
		this.name = "RobotDancer";
		this.work = "I just dance.";
	}

	public RobotDancer(String name, String work) {

	}

	public void work(String name, String work) {
		System.out.println("I'm" + this.name + "–" + "i" + this.work);
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