package Test;

public class Orange extends Fruit {
	private int canNang;

	public Orange(String tenHoaqua, double giaHoaqua, int soLuong, int canNang) {
		super(tenHoaqua, giaHoaqua, soLuong);
		this.canNang = canNang;
	}

	public int getCanNang() {
		return canNang;
	}

	public void setCanNang(int canNang) {
		this.canNang = canNang;
	}

	@Override
	public String toString() {
		return "Tên quả: " + getTenHoaqua() + "|| Giá: " + getGiaHoaqua() + "|| Số lượng: " + getSoLuong() + "|| Cân nặng: "
				+ getCanNang();
	}
}
