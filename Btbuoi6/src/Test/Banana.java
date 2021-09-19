package Test;

public class Banana extends Fruit {
	private int khoiLuong;

	public Banana(String tenHoaqua, double giaHoaqua, int soLuong, int khoiLuong) {
		super(tenHoaqua, giaHoaqua, soLuong);
		this.khoiLuong = khoiLuong;
	}

	public int getKhoiLuong() {
		return khoiLuong;
	}

	public void setKhoiLuong(int khoiLuong) {
		this.khoiLuong = khoiLuong;
	}

	@Override
	public String toString() {
		return "Tên quả: " + getTenHoaqua() + "|| Giá: " + getGiaHoaqua() + "|| Số lượng: " + getSoLuong()
				+ "|| Khối lượng đồng vị kali 40: " + getKhoiLuong();
	}
}
