package Model.Enum;

public enum Vitri {
	VITRI1(1, "Cổng bảo vệ"), VITRI2(2, "Nhà A2"), VITRI3(3, "Giảng đường");

	private int STT;
	private String vitri;

	private Vitri(int STT,String vitri) {
		this.STT = STT;
		this.vitri = vitri;
	}

	public static Vitri getVitri(int STT) {
		for (Vitri i : values()) {
			if (i.STT == STT)
				return i;
		}
		return null;
	}

	public String getVitri() {
		return vitri;
	}
}
