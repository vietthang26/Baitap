package Enum;

public enum Chucvu {
	BAOVE("Bảo vệ"), VESINH("Vệ sinh"), GIANGVIEN("Giảng Viên"), SINHVIEN("Sinh viên");

	private String chucVu;

	private Chucvu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getChucVu() {
		return chucVu;
	}
}
