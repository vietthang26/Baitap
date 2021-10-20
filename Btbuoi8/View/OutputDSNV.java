package View;

import java.util.List;

import Model.Entity.Info;
import Model.Singleton.DanhSachNhanVien;


public class OutputDSNV {
	static public void output() {
		System.out.println("Danh sách nhân viên");
		System.out.println("--------------------------------------------------");
		List<Info> a = DanhSachNhanVien.getInstance();
		for (Info i : a) {
			System.out.println(i);
		}
	}
}
