package Class;
//hình tam giác
public class Triangle extends Shape {
	int canh1,canh2,canh3;

	public Triangle() {
		
	}
	public int getNumberofSides() {
		return 3;
	} 
	public int getCanh1() {
		return canh1;
	}

	public void setCanh1(int canh1) {
		this.canh1 = canh1;
	}

	public int getCanh2() {
		return canh2;
	}

	public void setCanh2(int canh2) {
		this.canh2 = canh2;
	}

	public int getCanh3() {
		return canh3;
	}

	public void setCanh3(int canh3) {
		this.canh3 = canh3;
	}
	
	public double chuVi(int canh1, int canh2, int canh3) {
		return (canh1+canh2+canh3);
	}
	
	public double dienTich(int canh1, int canh2, int canh3) {
		double tb = (canh1+canh2+canh3)/2;
		return (Math.sqrt(tb*(tb-canh1)*(tb-canh2)*(tb-canh3)));
	}

}
