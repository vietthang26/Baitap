package Entity;

import Entity.Book;

public class Science extends Book {
	private int xuatBan;

	public Science(String nameTG, double price, int quantity, int xuatBan) {
		super(nameTG, price, quantity);
		this.xuatBan = xuatBan;
	}

	public int getXuatBan() {
		return xuatBan;
	}

	public void setXuatBan(int xuatBan) {
		this.xuatBan = xuatBan;
	}

	@Override
	public String toString() {
		return getId() + " | Tên tác giả: " + getNameTG() + " | Giá: " + getPrice() + " | Số lượng trong kho: "
				+ getQuantity() + " | Xuất bản năm: " + getXuatBan();
	}

	@Override
	public void theLoai() {
		// TODO Auto-generated method stub
		System.out.println("Thể loại: Khoa học");
	}
}
