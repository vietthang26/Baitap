package Enum;

public enum Type {
	CHINHQUY("Chính quy"), LIENTHONG("Liên thông"), TAICHUC("Tại chức");

	private String type;

	private Type(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
