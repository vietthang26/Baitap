package Model.Enum;

public enum Chucvu {
	BAOVE(1, "Bảo vệ"), VESINH(2, "Vệ sinh"), GIANGVIEN(3, "Giảng viên"), SINHVIEN(4, "Sinh viên");

	private String chucVu;
	private int STT;

	private Chucvu(int STT, String chucVu) {
		this.STT = STT;
		this.chucVu = chucVu;
	}

	public static Chucvu getChucvu(int STT) {
		for (Chucvu i : values()) {
			if (i.STT == STT)
				return i;
		}
		return null;
	}

	public String getChucVu() {
		return chucVu;
	}
}
