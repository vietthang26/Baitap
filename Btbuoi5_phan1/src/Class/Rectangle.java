package Class;
//hình chữ nhật
public class Rectangle extends Shape {
	int chieuDai, chieuRong;

	public Rectangle() {
	
	}
	public int getNumberofSides() {
		return 4;
	} 
	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public double chuVi(int chieuDai, int chieuRong) {
		return (2*chieuDai*chieuRong);
	}
	
	public double dienTich(int chieuDai, int chieuRong) {
		return (chieuDai*chieuRong);
	}
}
