package Model.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.LichLamViec;

public class BangLichHoc {
	static private List<LichLamViec> bangLichHoc = new ArrayList<LichLamViec>();

	private BangLichHoc() {

	}

	static public List<LichLamViec> getInstance() {
		return bangLichHoc;
	}

	static public boolean addToBangLH(LichLamViec lichLamViec) {
		bangLichHoc.add(lichLamViec);
		return true;
	}
}
