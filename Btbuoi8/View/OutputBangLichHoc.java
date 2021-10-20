package View;

import java.util.List;

import Model.Entity.LichLamViec;
import Model.Singleton.BangLichHoc;

public class OutputBangLichHoc {
	static public void output() {
		System.out.println("Bảng lịch Học");
		System.out.println("---------------------------------------------------------------------------");
		List<LichLamViec> d = BangLichHoc.getInstance();
		for (LichLamViec i : d) {
			System.out.println(i);
		}
	}
}
