package Controller;

import java.util.Scanner;

import Utils.ScannerUtils;
import View.InputBangLichGD;
import View.InputBangLichHoc;
import View.InputBangLichTruc;
import View.InputGiangVien;
import View.InputNhanVien;
import View.InputSinhVien;
import View.OutputBangLichGD;
import View.OutputBangLichHoc;
import View.OutputBangLichTruc;
import View.OutputDSGV;
import View.OutputDSNV;
import View.OutputDSSV;
import View.ShowMenu;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Thêm vào danh sách các loại (Sinh viên, Giảng viên, Nhân viên:Bảo vệ, Vệ sinh)
		int tieptuc = 1;
		do {
			ShowMenu.chonLoaiInput();
			int chonloai = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
			switch (chonloai) {
			case 1: // Thêm sinh viên
				InputSinhVien.input(input);
				break;
			case 2: // Thêm giảng viên
				InputGiangVien.input(input);
				break;
			case 3: // Thêm nhân viên
				InputNhanVien.input(input);
				break;
			}
			System.out.println("Nếu muốn tiếp tục thêm nhấn phím 1, nếu không nhân phím 2 !!!");
			tieptuc = input.nextInt();
		} while (tieptuc != 2);
		
		// In ra danh sách các loại
		tieptuc = 1;
		do {
			ShowMenu.chonLoaiOutputDS();
			int chonloai = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
			switch (chonloai) {
			case 1: // Danh sách sinh viên
				OutputDSSV.output();
				break;
			case 2: // Danh sách giảng viên
				OutputDSGV.output();
				break;
			case 3: // Danh sách nhân viên
				OutputDSNV.output();
				break;
			}
			System.out.println("Nếu muốn tiếp tục in danh sách nhấn phím 1, nếu không nhân phím 2 !!!");
			tieptuc = input.nextInt();
		} while (tieptuc != 2);
		// Thêm vào bảng lịch các loại
		tieptuc = 1;
		do {
			ShowMenu.chonLoaiInputLich();
			int chonloai = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
			switch (chonloai) {
			case 1: // Thêm lịch giảng dạy
				InputBangLichGD.input(input);
				break;
			case 2: // Thêm lịch học
				InputBangLichHoc.input(input);
				break;
			case 3: // Thêm lịch trực
				InputBangLichTruc.input(input);
				break;
			}
			System.out.println("Nếu muốn tiếp tục thêm nhấn phím 1, nếu không nhân phím 2 !!!");
			tieptuc = input.nextInt();
		} while (tieptuc != 2);
		// In ra bảng lịch các loại
		tieptuc = 1;
		do {
			ShowMenu.chonLoaiOutputLich();
			int chonloai = ScannerUtils.readInt(input, "Bạn đã nhập sai", 1, 3);
			switch (chonloai) {
			case 1: // Bảng lịch giảng dạy
				OutputBangLichGD.output();
				break;
			case 2: // Bảng lịch học
				OutputBangLichHoc.output();
				break;
			case 3: // Bảng lịch trực
				OutputBangLichTruc.output();
				break;
			}
			System.out.println("Nếu muốn tiếp tục in bảng nhấn phím 1, nếu không nhân phím 2 !!!");
			tieptuc = input.nextInt();
		} while (tieptuc != 2);
	}
}
