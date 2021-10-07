package Entity;

import Entity.Book;

public class Literature extends Book {
	private int taiBan;

	public Literature(String nameTG, double price, int quantity, int taiBan) {
		super(nameTG, price, quantity);
		this.taiBan = taiBan;
	}

	public int getTaiBan() {
		return taiBan;
	}

	public void setTaiBan(int taiBan) {
		this.taiBan = taiBan;
	}

	@Override
	public String toString() {
		return getId() + " | Tên tác giả: " + getNameTG() + " | Giá: " + getPrice() + " | Số lượng trong kho: "
				+ getQuantity() + " | Tái bản lần thứ: " + getTaiBan();
	}

	@Override
	public void theLoai() {
		// TODO Auto-generated method stub
		System.out.println("Thể loại: Văn học");
	}
}
