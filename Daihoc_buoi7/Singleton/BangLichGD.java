package Singleton;

import java.util.ArrayList;
import java.util.List;

import Entity.LichLamViec;

public class BangLichGD {
	static private List<LichLamViec> bangLichGD = new ArrayList<LichLamViec>();

	private BangLichGD() {
		
	}

	static public List<LichLamViec> getInstance() {
		return bangLichGD;
	}

	static public boolean addToBangLGD(LichLamViec lichLamViec) {
		bangLichGD.add(lichLamViec);
		return true;
	}
}
