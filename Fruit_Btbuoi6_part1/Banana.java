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

	@Override
	public void vitamin() {
		System.out.println("Vitamin B6");
	}
	@Override
	public String toString() {
		return getId() +" | Tên quả: " + getName() + " | Giá: " + getPrice() + " | Số lượng trong kho: " + getQuantity()
				+ " | Cân nặng: " + getWeight();
	}
}
