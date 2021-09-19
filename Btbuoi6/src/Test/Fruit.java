package Test;

public class Fruit {
	private String tenHoaqua;
	private double giaHoaqua;
	private int soLuong;

	public Fruit(String tenHoaqua, double giaHoaqua, int soLuong) {
		super();
		this.tenHoaqua = tenHoaqua;
		this.giaHoaqua = giaHoaqua;
		this.soLuong = soLuong;
	}

	public String getTenHoaqua() {
		return tenHoaqua;
	}

	public void setTenHoaqua(String tenHoaqua) {
		this.tenHoaqua = tenHoaqua;
	}

	public double getGiaHoaqua() {
		return giaHoaqua;
	}

	public void setGiaHoaqua(double giaHoaqua) {
		this.giaHoaqua = giaHoaqua;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}
