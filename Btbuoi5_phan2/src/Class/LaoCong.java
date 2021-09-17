package Class;

import java.util.Scanner;

public class LaoCong extends People{
	String maLaocong;

	public LaoCong(String ten, int tuoi, String cCCD, String maLaocong) {
		super(ten, tuoi, cCCD);
		this.maLaocong = maLaocong;
	}

	public String getMaLaocong() {
		return maLaocong;
	}

	public void setMaLaocong(String maLaocong) {
		this.maLaocong = maLaocong;
	}

}
