package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HocSinh> hocSinh = new ArrayList<>();
		System.out.println("Mời bạn nhập số lượng học sinh: ");
		int a = input.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("Mời bạn nhập tên của sinh viên thứ " + (i + 1) + " :");
			String ten1 = input.next();
			System.out.println("Mời bạn nhập tuổi của sinh viên thứ " + (i + 1) + " :");
			int ten2 = input.nextInt();
			System.out.println("Mời bạn nhập CCCD của sinh viên thứ " + (i + 1) + " :");
			String ten3 = input.next();
			System.out.println("Mời bạn nhập mã của sinh viên thứ " + (i + 1) + " :");
			String ten4 = input.next();
			HocSinh hocsinh = new HocSinh(ten1, ten2, ten3, ten4);
			hocSinh.add(hocsinh);
			System.out.printf("%s %d %s %s", hocSinh.get(i).getTen(), hocSinh.get(i).getTuoi(),
					hocSinh.get(i).getcCCD(), hocSinh.get(i).getMaSV());
		}
		ArrayList<GiaoVien> giaoVien = new ArrayList<>();
		System.out.println("Mời bạn nhập số lượng giáo viên: ");
		int b = input.nextInt();
		for (int i = 0; i < b; i++) {
			System.out.println("Mời bạn nhập tên của giáo viên thứ " + (i + 1) + " :");
			String gv1 = input.next();
			System.out.println("Mời bạn nhập tuổi của giáo viên thứ " + (i + 1) + " :");
			int gv2 = input.nextInt();
			System.out.println("Mời bạn nhập CCCD của giáo viên thứ " + (i + 1) + " :");
			String gv3 = input.next();
			System.out.println("Mời bạn nhập mã của giáo viên thứ " + (i + 1) + " :");
			String gv4 = input.next();
			System.out.println("Mời bạn nhập môn dạy của giáo viên thứ " + (i + 1) + " :");
			String gv5 = input.next();
			GiaoVien giaovien = new GiaoVien(gv1, gv2, gv3, gv4, gv5);
			giaoVien.add(giaovien);
			System.out.printf("%s %d %s %s %s", giaoVien.get(i).getTen(), giaoVien.get(i).getTuoi(),
					giaoVien.get(i).getcCCD(), giaoVien.get(i).getMaGV(), giaoVien.get(i).getMonHoc());
		}
		ArrayList<BaoVe> baoVe = new ArrayList<>();
		System.out.println("Mời bạn nhập số lượng bảo vệ: ");
		int c = input.nextInt();
		for (int i = 0; i < c; i++) {
			System.out.println("Mời bạn nhập tên của bảo vệ thứ " + (i + 1) + " :");
			String bv1 = input.next();
			System.out.println("Mời bạn nhập tuổi của bảo vệ thứ " + (i + 1) + " :");
			int bv2 = input.nextInt();
			System.out.println("Mời bạn nhập CCCD của bảo vệ thứ " + (i + 1) + " :");
			String bv3 = input.next();
			System.out.println("Mời bạn nhập mã của bảo vệ thứ " + (i + 1) + " :");
			String bv4 = input.next();
			BaoVe baove = new BaoVe(bv1, bv2, bv3, bv4);
			baoVe.add(baove);
			System.out.printf("%s %d %s %s", baoVe.get(i).getTen(), baoVe.get(i).getTuoi(),
					baoVe.get(i).getcCCD(), baoVe.get(i).getMaBaove());
		}
		ArrayList<LaoCong> laoCong = new ArrayList<>();
		System.out.println("Mời bạn nhập số lượng lao công: ");
		int d = input.nextInt();
		for (int i = 0; i < d; i++) {
			System.out.println("Mời bạn nhập tên của lao công thứ " + (i + 1) + " :");
			String lc1 = input.next();
			System.out.println("Mời bạn nhập tuổi của lao công thứ " + (i + 1) + " :");
			int lc2 = input.nextInt();
			System.out.println("Mời bạn nhập CCCD của lao công thứ " + (i + 1) + " :");
			String lc3 = input.next();
			System.out.println("Mời bạn nhập mã của lao công thứ " + (i + 1) + " :");
			String lc4 = input.next();
			LaoCong laocong = new LaoCong(lc1, lc2, lc3, lc4);
			laoCong.add(laocong);
			System.out.printf("%s %d %s %s", laoCong.get(i).getTen(), laoCong.get(i).getTuoi(),
					laoCong.get(i).getcCCD(), laoCong.get(i).getMaLaocong());
		}
	}
}
