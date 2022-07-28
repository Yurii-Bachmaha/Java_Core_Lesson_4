package homework04;

public class Application {

	public static void main(String[] args) {

		Robot robot1 = new Robot();
		CoffeRobot robot2 = new CoffeRobot();
		RobotDancer robot3 = new RobotDancer();
		RobotCoocker robot4 = new RobotCoocker();

		System.out.println(robot1);
		System.out.println(robot2);
		System.out.println(robot3);
		System.out.println(robot4);

		Robot[] arrayRobot = { robot1, robot2, robot3, robot4 };

		for (int i = 0; i < arrayRobot.length; i++) {
			arrayRobot[i].work();
		}
	}
}