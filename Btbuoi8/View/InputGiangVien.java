package View;

import java.util.Scanner;

import Model.Entity.Giangvien;
import Model.Enum.Chucvu;
import Model.Enum.Gioitinh;
import Model.Singleton.DanhSachGiangVien;
import Utils.ScannerUtils;

public class InputGiangVien {
	public static void input(Scanner input) {
		System.out.print("Mời bạn nhập tên: ");
		String ten = input.next();
		System.out.print("Mời bạn nhập tuổi: ");
		int tuoi = input.nextInt();
		ShowMenu.GioiTinh();
		int gioitinh = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
		switch(gioitinh) {
		case 1: //Nam
			DanhSachGiangVien.addToDSGV(new Giangvien(ten, tuoi, Gioitinh.NAM, Chucvu.GIANGVIEN));
			break;
		case 2: //Nữ
			DanhSachGiangVien.addToDSGV(new Giangvien(ten, tuoi, Gioitinh.NU, Chucvu.GIANGVIEN));
			break;
		case 3: //Khác
			DanhSachGiangVien.addToDSGV(new Giangvien(ten, tuoi, Gioitinh.KHAC, Chucvu.GIANGVIEN));
			break;
		}
	}
}
