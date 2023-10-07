package animals;

import java.util.ArrayList;

public class Zoo {
	ArrayList<Animals> animals = new ArrayList<Animals>();
	
	Zoo() {}
	
	public ArrayList<Animals> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Animals> animals) {
		this.animals = animals;
	}

	public void addAnimal(Animals animal) {
		getAnimals().add(animal);
	}
	
	public void listAnimals() {
		for (Animals animal : getAnimals()) {
			System.out.printf("%s - %s\n", animal.getName(), animal.getSound());
		}
	}
	
}
