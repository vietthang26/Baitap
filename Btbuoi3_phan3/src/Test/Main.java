package Test;

import java.util.ArrayList;
import java.util.Scanner;

import Class.Sach;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Sach> lst_Sach = new ArrayList<Sach>();
		System.out.println("Mời bạn nhập số lượng sách: ");
		int slSach = input.nextInt();
		for (int i=0;i<slSach;i++) {
			System.out.println("Mời bạn tên nhập sách thứ " + (i+1));
			input.next();
			String tenSach = input.nextLine();
			System.out.println("Mời bạn nhập tên tác giả của sách thứ "+(i+1));
			String tacGia = input.nextLine();
			System.out.println("Mời bạn nhập trạng thái của sách thứ "+(i+1));
			String trangThai = input.nextLine();
			Sach sach1 = new Sach(tenSach,tacGia,trangThai);
			lst_Sach.add(sach1);
		}
		for (int i=0;i<slSach;i++) {
			System.out.println("Sách thứ "+(i+1)+" có chi tiết như sau");
			System.out.printf("%s %s %s\n",lst_Sach.get(i).getTenSach(),lst_Sach.get(i).getTacGia(),lst_Sach.get(i).getTrangThai());
		}
		System.out.println("Mời bạn nhập tên sách cần tìm ");
		String sachCantim = input.nextLine();
		int dem=0;
		for (int i=0;i<slSach;i++) {
			if (sachCantim.equals(lst_Sach.get(i).getTenSach()))
				dem++;
		}
		System.out.println("Số lượng sách cần tìm hiện có "+(dem)+" quyển trong kho");
	}
	
}
