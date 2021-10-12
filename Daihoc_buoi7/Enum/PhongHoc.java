package Enum;

public enum PhongHoc {
	P1("B302"), P2("A603"), P3("A501");

	private String phonghoc;

	PhongHoc(String phonghoc) {
		this.phonghoc = phonghoc;
	}

	public String getPhonghoc() {
		return phonghoc;
	}
}
