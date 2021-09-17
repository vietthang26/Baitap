package Class;
//hình vuông
public class Square  {
	int canh;

	public Square() {
	
	}
	public int getNumberofSides() {
		return 4;
	} 
	public int getCanh() {
		return canh;
	}

	public void setCanh(int canh) {
		this.canh = canh;
	}
	
	public double chuVi(int canh) {
		return (4*canh);
	}
	
	public double dienTich(int canh) {
		return (canh*canh);
	}
	
}
