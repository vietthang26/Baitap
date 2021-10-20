package Model.Entity;

import Model.Enum.Time;

abstract public class LichLamViec {
	private int ID;
	Time time;

	public LichLamViec(int iD, Time time) {
		ID = iD;
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
