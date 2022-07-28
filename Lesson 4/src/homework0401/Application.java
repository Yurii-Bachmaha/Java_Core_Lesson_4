package homework0401;

public class Application {

	public static void main(String[] args) {

		Animal animal = new Animal("Leopard", 58, 8);

		String animalName = animal.getAnimalName();
		int animalSpeed = animal.getAnimalSpeed();
		int animalAge = animal.getAnimalAge();

		System.out.println("Animal name = " + animalName + ", Animal speed = " + animalSpeed + ", Animal age = "
				+ animalAge + " years.");

		animal.setAnimalName("Rhinoceros");
		animal.setAnimalSpeed(50);
		animal.setAnimalAge(40);

		animalName = animal.getAnimalName();
		animalSpeed = animal.getAnimalSpeed();
		animalAge = animal.getAnimalAge();

		System.out.println();
		System.out.println("Animal name = " + animalName + ", Animal speed = " + animalSpeed + ", Animal age = "
				+ animalAge + " years.");
	}
}