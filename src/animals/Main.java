package animals;

public class Main {

	public static void main(String[] args) {
		Mammal mammal = new Mammal("Lion", 5, "Rawr", "Golden");
		Bird bird = new Bird("Penny", 7, "Squawk", 0.75f);
		
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(mammal);
		zoo.addAnimal(bird);
		
		zoo.listAnimals();
		
	}

}
