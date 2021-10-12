package Entity;

import Enum.PhongHoc;

public class LichHoc extends LichLamViec {
	PhongHoc phonghoc;

	public LichHoc(int ID, Time time, PhongHoc phonghoc) {
		super(ID, time);
		this.phonghoc = phonghoc;
	}

	public PhongHoc getPhonghoc() {
		return phonghoc;
	}

	public void setPhonghoc(PhongHoc phonghoc) {
		this.phonghoc = phonghoc;
	}
	@Override
	public String toString() {
		return "ID: " +getID() +"	Thời gian: "+getTime().getTime()+"	Phòng học: "+ getPhonghoc().getPhonghoc(); 
	}
}
