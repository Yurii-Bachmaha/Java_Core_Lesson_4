package homework04;

public class RobotCoocker extends Robot {

	RobotCoocker() {
		super();
		this.name = "RobotCoocker";
		this.work = "I just cook.";
	}

	public RobotCoocker(String name, String work) {

	}

	public void work(String name, String work) {
		System.out.println("I'm" + this.name + "–" + "I" + this.work);
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