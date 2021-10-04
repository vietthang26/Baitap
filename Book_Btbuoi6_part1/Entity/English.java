package Entity;

import Entity.Book;

public class English extends Book {
	private int maISBN;

	public English(String nameTG, double price, int quantity, int maISBN) {
		super(nameTG, price, quantity);
		this.maISBN = maISBN;
	}

	public int getMaISBN() {
		return maISBN;
	}

	public void setMaISBN(int maISBN) {
		this.maISBN = maISBN;
	}

	@Override
	public String toString() {
		return getId() +" | Tên tác giả: " + getNameTG() + " | Giá: " + getPrice() + " | Số lượng trong kho: " + getQuantity()
				+ " | Mã ISBN: " + getMaISBN();
	}

	@Override
	public void theLoai() {
		System.out.println("Thể loại: Tiếng anh");
	}
}
