package Entity;

public class Apple extends Fruit {
	private int sugar;

	public Apple(String name, double price, int quantity, int sugar) {
		super(name, price, quantity);
		this.sugar = sugar;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	@Override
	public void vitamin() {
		System.out.println("Vitamin A, Vitamin E");
	}

	@Override
	public String toString() {
		return getId() + " | Tên quả: " + getName() + " | Giá: " + getPrice() + " | Số lượng trong kho: "
				+ getQuantity() + " | Lượng đường: " + getSugar();
	}
}
