package Model.Enum;

public enum Phonghoc {
	P1(1, "B302"), P2(2, "A603"), P3(3, "A501");

	private int STT;
	private String phongHoc;

	private Phonghoc(int STT, String phongHoc) {
		this.STT = STT;
		this.phongHoc = phongHoc;
	}

	public static Phonghoc getPhonghoc(int STT) {
		for (Phonghoc i : values()) {
			if (i.STT == STT)
				return i;
		}
		return null;
	}

	public String getPhonghoc() {
		return phongHoc;
	}
}
