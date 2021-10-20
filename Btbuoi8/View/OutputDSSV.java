package View;

import java.util.List;

import Model.Entity.Info;
import Model.Singleton.DanhSachSinhVien;

public class OutputDSSV {
	static public void output() {
		System.out.println("Danh sách sinh viên");
		System.out.println("--------------------------------------------------");
		List<Info> a = DanhSachSinhVien.getInstance();
		for (Info i : a) {
			System.out.println(i);
		}
	}
}
