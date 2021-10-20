package View;

import java.util.List;

import Model.Entity.Info;
import Model.Singleton.DanhSachGiangVien;

public class OutputDSGV {
	static public void output() {
		System.out.println("Danh sách giảng viên");
		System.out.println("--------------------------------------------------");
		List<Info> a = DanhSachGiangVien.getInstance();
		for (Info i : a) {
			System.out.println(i);
		}
	}
}
