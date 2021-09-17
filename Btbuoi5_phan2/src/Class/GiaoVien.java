package Class;

public class GiaoVien extends People{
	String maGV;
	String monHoc;
	
	public GiaoVien(String ten, int tuoi, String cCCD, String maGV, String monHoc) {
		super(ten, tuoi, cCCD);
		this.maGV = maGV;
		this.monHoc = monHoc;
	}

	public String getMaGV() {
		return maGV;
	}

	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}
	
	
}
