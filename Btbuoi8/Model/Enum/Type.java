package Model.Enum;

public enum Type {
	CHINHQUY(1, "Chính quy"), LIENTHONG(2, "Liên thông"), TAICHUC(3, "Tại chức");

	private int STT;
	private String type;

	private Type(int STT, String type) {
		this.STT = STT;
		this.type = type;
	}

	public static Type getType(int STT) {
		for (Type i : values()) {
			if (i.STT == STT)
				return i;
		}
		return null;
	}

	public String getType() {
		return type;
	}
}
