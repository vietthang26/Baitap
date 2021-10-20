package Model.Entity;

import Model.Enum.Phonghoc;
import Model.Enum.Time;

public class LichGiangDay extends LichLamViec {
	Phonghoc phonghoc;

	public LichGiangDay(int iD, Time time, Phonghoc phonghoc) {
		super(iD, time);
		this.phonghoc = phonghoc;
	}

	public Phonghoc getPhonghoc() {
		return phonghoc;
	}

	public void setPhonghoc(Phonghoc phonghoc) {
		this.phonghoc = phonghoc;
	}
	@Override
	public String toString() {
		return "ID: " + getID() + "		Thời gian: " + getTime().getTime() + "		Phòng học: "+ getPhonghoc().getPhonghoc();
	}
}
