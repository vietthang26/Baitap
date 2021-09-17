package Class;

import java.util.Scanner;

public class BaoVe extends People{
	String maBaove;

	public BaoVe(String ten, int tuoi, String cCCD, String maBaove) {
		super(ten, tuoi, cCCD);
		this.maBaove = maBaove;
	}

	public String getMaBaove() {
		return maBaove;
	}

	public void setMaBaove(String maBaove) {
		this.maBaove = maBaove;
	}
	
}
