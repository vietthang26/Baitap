package Entity;

abstract public class LichLamViec {
	private int ID;
	Time time;

	public enum Time {
		TIET1(1, "6h45-8h45"), TIET2(2, "8h45-10h45"), TIET3(3, "10h45-12h45");

		private int i;
		private String time;

		Time(int i, String time) {
			this.i = i;
			this.time = time;
		}

		public int getI() {
			return i;
		}

		public String getTime() {
			return time;
		}
		
	}

	public LichLamViec(int ID, Time time) {
		this.ID = ID;
		this.time = time;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
