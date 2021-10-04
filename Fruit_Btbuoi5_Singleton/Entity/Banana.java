package Entity;

public class Banana extends Fruit {
	private double weight;

	public Banana(String name, double price, int quantity, double weight) {
		super(name, price, quantity);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
