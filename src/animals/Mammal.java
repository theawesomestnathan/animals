package animals;

public class Mammal extends Animals {
	private String furColor;
	
	Mammal(String name, int age, String sound, String furColor) {
		super(name, age, sound);
		setFurColor(furColor);
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
}
