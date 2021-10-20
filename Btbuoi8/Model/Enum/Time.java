package Model.Enum;

public enum Time {
	TIET1(1, "6h45-8h45"), TIET2(2, "8h45-10h45"), TIET3(3, "10h45-12h45");

	private int STT;
	private String time;

	private Time(int STT, String time) {
		this.STT = STT;
		this.time = time;
	}

	public static Time getTime(int STT) {
		for (Time i : values()) {
			if (i.STT == STT)
				return i;
		}
		return null;
	}

	public String getTime() {
		return time;
	}
}
