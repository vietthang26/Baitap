package View;

import java.util.Scanner;

import Model.Entity.LichHoc;
import Model.Enum.Phonghoc;
import Model.Enum.Time;
import Model.Singleton.BangLichHoc;
import Model.Singleton.DanhSachSinhVien;
import Utils.ScannerUtils;

public class InputBangLichHoc {
	static public void input(Scanner input) {
		System.out.println("Mời bạn nhập ID của sinh viên: ");
		int id = input.nextInt();
		if (DanhSachSinhVien.isValid(id) == true) {
			ShowMenu.TietHoc();
			int tiethoc = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
			ShowMenu.PhongHoc();
			int phonghoc = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
			switch (tiethoc) {
			case 1:
				switch (phonghoc) {
				case 1:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET1, Phonghoc.P1));
					break;
				case 2:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET1, Phonghoc.P2));
					break;
				case 3:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET1, Phonghoc.P3));
					break;
				}
				break;
			case 2:
				switch (phonghoc) {
				case 1:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET2, Phonghoc.P1));
					break;
				case 2:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET2, Phonghoc.P2));
					break;
				case 3:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET2, Phonghoc.P3));
					break;
				}
				break;
			case 3:
				switch (phonghoc) {
				case 1:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET3, Phonghoc.P1));
					break;
				case 2:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET3, Phonghoc.P2));
					break;
				case 3:
					BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET3, Phonghoc.P3));
					break;
				}
				break;
			}
		} else {
			System.out.println("ID không có trong danh sách !!!");
		}
	}
}
