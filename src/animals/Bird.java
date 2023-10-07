package animals;

public class Bird extends Animals {
	private float wingSpan;
	
	Bird(String name, int age, String sound, float wingSpan) {
		super(name, age, sound);
		setWingSpan(wingSpan);
	}

	public float getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(float wingSpan) {
		this.wingSpan = wingSpan;
	}
	
}
