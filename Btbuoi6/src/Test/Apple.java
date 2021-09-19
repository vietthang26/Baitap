package Test;

public class Apple extends Fruit {
	private int luongDuong;

	public Apple(String tenHoaqua, double giaHoaqua, int soLuong, int luongDuong) {
		super(tenHoaqua, giaHoaqua, soLuong);
		this.luongDuong = luongDuong;
	}

	public int getLuongDuong() {
		return luongDuong;
	}

	public void setLuongDuong(int luongDuong) {
		this.luongDuong = luongDuong;
	}
	@Override
	public String toString() {
		return "Tên quả: " + getTenHoaqua() + "|| Giá: " + getGiaHoaqua() + "|| Số lượng: " + getSoLuong() + "|| Lượng đường: "
				+ getLuongDuong();
	}
}
