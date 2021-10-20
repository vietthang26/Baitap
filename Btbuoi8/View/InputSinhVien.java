package View;

import java.util.Scanner;

import Model.Entity.SinhVien;
import Model.Enum.Chucvu;
import Model.Enum.Gioitinh;
import Model.Enum.Type;
import Model.Singleton.DanhSachSinhVien;
import Utils.ScannerUtils;

public class InputSinhVien {
	public static void input(Scanner input) {
		System.out.print("Mời bạn nhập tên: ");
		String ten = input.next();
		System.out.print("Mời bạn nhập tuổi: ");
		int tuoi = input.nextInt();
		ShowMenu.GioiTinh();
		int gioitinh;
		gioitinh = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
		ShowMenu.Loai();
		int loai;
		loai = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
		switch (gioitinh) {
		case 1:// Nam
			switch (loai) {
			case 1:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.NAM, Chucvu.SINHVIEN, Type.CHINHQUY));
				break;
			case 2:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.NAM, Chucvu.SINHVIEN, Type.LIENTHONG));
				break;
			case 3:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.NAM, Chucvu.SINHVIEN, Type.TAICHUC));
				break;
			}
			break;
		case 2: // Nữ
			switch (loai) {
			case 1:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.NU, Chucvu.SINHVIEN, Type.CHINHQUY));
				break;
			case 2:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.NU, Chucvu.SINHVIEN, Type.LIENTHONG));
				break;
			case 3:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.NU, Chucvu.SINHVIEN, Type.TAICHUC));
				break;
			}
			break;
		case 3: // Khác
			switch (loai) {
			case 1:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.KHAC, Chucvu.SINHVIEN, Type.CHINHQUY));
				break;
			case 2:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.KHAC, Chucvu.SINHVIEN, Type.LIENTHONG));
				break;
			case 3:
				DanhSachSinhVien.addToDSSV(new SinhVien(ten, tuoi, Gioitinh.KHAC, Chucvu.SINHVIEN, Type.TAICHUC));
				break;
			}
			break;
		}
	}
}