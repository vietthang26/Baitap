package View;

import java.util.List;

import Model.Entity.LichLamViec;
import Model.Singleton.BangLichGD;

public class OutputBangLichGD {
	static public void output() {
		System.out.println("Bảng lịch Giảng dạy");
		System.out.println("---------------------------------------------------------------------------");
		List<LichLamViec> d = BangLichGD.getInstance();
		for (LichLamViec i : d) {
			System.out.println(i);
		}
	}
}
