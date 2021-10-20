package Model.Enum;

public enum Gioitinh {
	NAM(1, "Nam"), NU(2, "Nữ"), KHAC(3,"Khác");

	private String gioiTinh;
	private int STT;

	private Gioitinh(int STT, String gioiTinh) {
		this.STT = STT;
		this.gioiTinh = gioiTinh;
	}

	public static Gioitinh getGioitinh(int STT) {
		for (Gioitinh i : values()) {
			if (i.STT == STT)
				return i;
		}
		return null;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

}
