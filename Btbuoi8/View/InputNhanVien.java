package View;

import java.util.Scanner;

import Model.Entity.Baove;
import Model.Entity.VeSinh;
import Model.Enum.Chucvu;
import Model.Enum.Gioitinh;
import Model.Singleton.DanhSachNhanVien;
import Utils.ScannerUtils;

public class InputNhanVien {
	public static void input(Scanner input) {
		System.out.print("Mời bạn nhập tên: ");
		String ten = input.next();
		System.out.print("Mời bạn nhập tuổi: ");
		int tuoi = input.nextInt();
		ShowMenu.GioiTinh();
		int gioitinh;
		gioitinh = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
		ShowMenu.ChucVu();
		int chucvu;
		chucvu = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 2);
		switch (gioitinh) {
		case 1: // Nam
			switch (chucvu) {
			case 1:
				DanhSachNhanVien.addToDSNV(new Baove(ten, tuoi, Gioitinh.NAM, Chucvu.BAOVE));
				break;
			case 2:
				DanhSachNhanVien.addToDSNV(new VeSinh(ten, tuoi, Gioitinh.NAM, Chucvu.VESINH));
				break;
			}
			break;
		case 2: // Nữ
			switch (chucvu) {
			case 1:
				DanhSachNhanVien.addToDSNV(new Baove(ten, tuoi, Gioitinh.NU, Chucvu.BAOVE));
				break;
			case 2:
				DanhSachNhanVien.addToDSNV(new VeSinh(ten, tuoi, Gioitinh.NU, Chucvu.VESINH));
				break;
			}
			break;
		case 3: // Khác
			switch (chucvu) {
			case 1:
				DanhSachNhanVien.addToDSNV(new Baove(ten, tuoi, Gioitinh.KHAC, Chucvu.BAOVE));
				break;
			case 2:
				DanhSachNhanVien.addToDSNV(new VeSinh(ten, tuoi, Gioitinh.KHAC, Chucvu.VESINH));
				break;
			}
			break;
		}
	}
}
