package View;

import java.util.List;

import Model.Entity.LichLamViec;
import Model.Singleton.BangLichTruc;

public class OutputBangLichTruc {
	static public void output() {
		System.out.println("Bảng lịch trực");
		System.out.println("---------------------------------------------------------------------------");
		List<LichLamViec> d = BangLichTruc.getInstance();
		for (LichLamViec i : d) {
			System.out.println(i);
		}
	}
}
