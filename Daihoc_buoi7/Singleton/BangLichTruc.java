package Singleton;

import java.util.ArrayList;
import java.util.List;

import Entity.LichLamViec;

public class BangLichTruc {
	static private List<LichLamViec> bangLichTruc = new ArrayList<LichLamViec>();
	
	private BangLichTruc() {
		
	}
	static public List<LichLamViec> getInstance(){
		return bangLichTruc;
	}
	
	static public boolean addToBangLT(LichLamViec lichLamViec) {
		bangLichTruc.add(lichLamViec);
		return true;
	}
}
