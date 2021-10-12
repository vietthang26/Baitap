package Enum;

public enum ViTri {
	VITRI1("Cổng bảo vệ"), VITRI2("Nhà A2"), VITRI3("Giảng đường");

	private String vitri;

	ViTri(String vitri) {
		this.vitri = vitri;
	}

	public String getVitri() {
		return vitri;
	}
}
