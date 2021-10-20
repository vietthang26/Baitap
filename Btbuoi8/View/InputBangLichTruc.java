package View;

import java.util.Scanner;

import Model.Entity.LichTrucNV;
import Model.Enum.Time;
import Model.Enum.Vitri;
import Model.Singleton.BangLichTruc;
import Model.Singleton.DanhSachNhanVien;
import Utils.ScannerUtils;

public class InputBangLichTruc {
	static public void input(Scanner input) {
		System.out.println("Mời bạn nhập ID của nhân viên: ");
		int id = input.nextInt();
		if (DanhSachNhanVien.isValid(id) == true) {
			ShowMenu.TietHoc();
			int tiethoc = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
			ShowMenu.ViTri();
			int vitri = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
			switch (tiethoc) {
			case 1:
				switch (vitri) {
				case 1:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET1, Vitri.VITRI1));
					break;
				case 2:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET1, Vitri.VITRI2));
					break;
				case 3:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET1, Vitri.VITRI3));
					break;
				}
				break;
			case 2:
				switch (vitri) {
				case 1:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET2, Vitri.VITRI1));
					break;
				case 2:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET2, Vitri.VITRI2));
					break;
				case 3:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET2, Vitri.VITRI3));
					break;
				}
				break;
			case 3:
				switch (vitri) {
				case 1:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET3, Vitri.VITRI1));
					break;
				case 2:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET3, Vitri.VITRI2));
					break;
				case 3:
					BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET3, Vitri.VITRI3));
					break;
				}
				break;
			}
		} else {
			System.out.println("ID không có trong danh sách !!!");
		}
	}
}
