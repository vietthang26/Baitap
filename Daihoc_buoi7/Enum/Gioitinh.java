package Enum;

public enum Gioitinh {
	NAM("Nam"), NU("Nữ");

	private String gioiTinh;

	private Gioitinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public static Gioitinh getGioitinh(String gioiTinh) {
		for(Gioitinh i : values()) {
			if(i.gioiTinh == gioiTinh) return i;
		}
		return null;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}
	
}
