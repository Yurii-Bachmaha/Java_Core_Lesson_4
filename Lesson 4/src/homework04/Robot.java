package homework04;

public class Robot {

	String name;
	String work;

	Robot() {
		this.name = "Robot";
		this.work = "I just work.";
	}

	public Robot(String name, String work) {
		super();
		this.name = "Robot";
		this.work = "I just work";
	}

	public void work(String name, String work) {
		System.out.println("I'm a " + this.name + "–" + this.work);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "I'm a " + name + " - " + work;
	}

	public void work() {

	}

}