package Class;
//hình bình hành
public class Parallelogram extends Shape {
	int canhDay, canhBen, chieuCao;

	public Parallelogram() {

	}
	public int getNumberofSides() {
		return 4;
	} 
	public int getCanhDay() {
		return canhDay;
	}

	public void setCanhDay(int canhDay) {
		this.canhDay = canhDay;
	}

	public int getCanhBen() {
		return canhBen;
	}

	public void setCanhBen(int canhBen) {
		this.canhBen = canhBen;
	}

	public int getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}
	
	public double chuVi(int canhBen, int canhDay) {
		return (2*(canhBen+canhDay));
	}
	
	public double dienTich(int chieuCao, int canhDay) {
		return (canhDay*chieuCao);
	}
	

}
