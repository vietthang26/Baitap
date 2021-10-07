package Entity;

import Entity.Book;

public abstract class Book {
	private int id;
	private String nameTG;
	private double price;
	private int quantity;
	static private int count;

	public Book(String nameTG, double price, int quantity) {
		super();
		this.nameTG = nameTG;
		this.price = price;
		this.quantity = quantity;
		this.id = ++count;
	}

	abstract public void theLoai();

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}

	public String getNameTG() {
		return nameTG;
	}

	public void setNameTG(String nameTG) {
		this.nameTG = nameTG;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Book.count = count;
	}

	public int getId() {
		return id;
	}

}
