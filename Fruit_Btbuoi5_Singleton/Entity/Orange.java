package Entity;

public class Orange extends Fruit {
	private double kali;

	public Orange(String name, double price, int quantity, double kali) {
		super(name, price, quantity);
		this.kali = kali;
	}

	public double getKali() {
		return kali;
	}

	public void setKali(double kali) {
		this.kali = kali;
	}

}
