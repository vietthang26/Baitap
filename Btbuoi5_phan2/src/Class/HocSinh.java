package Class;

import java.util.Scanner;

public class HocSinh extends People{
	String maSV;
	
	public HocSinh(String ten, int tuoi, String cCCD, String maSV) {
		super(ten, tuoi, cCCD);
		this.maSV = maSV;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	
}
