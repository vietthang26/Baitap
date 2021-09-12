package Btbuoithu2;

import java.util.ArrayList;
import java.util.Scanner;

public class Nhaphocsinh {
	private ArrayList<Students> hocsinh;
	double TB=0; 
	int n;
	
	public Nhaphocsinh() {
		int hs;
		hocsinh = new ArrayList<Students>();
		String ten,lophoc;
		int tuoi, math, literature, english;
		Scanner input = new Scanner(System.in); 
		System.out.println("Mời bạn nhập số học sinh: ");
		hs = input.nextInt();
		n=hs;
		for (int i=0 ; i<hs ;i++) {
			System.out.println("Nhập học sinh thứ " + (i+1));
			System.out.println("Mời bạn nhập tên: ");
			input.next();
			ten = input.nextLine();
			System.out.println("Mời bạn nhập tuổi: ");
			tuoi = input.nextInt();
			System.out.println("Mời bạn nhập lớp: ");
			lophoc = input.next();
			System.out.println("Mời bạn nhập điểm môn Toán: ");
			math = input.nextInt();
			System.out.println("Mời bạn nhập điểm môn Văn: ");
			literature = input.nextInt();
			System.out.println("Mời bạn nhập điểm môn Tiếng Anh: ");
			english = input.nextInt();
			hocsinh.add(new Students(ten,lophoc,tuoi,math, literature, english));
			TB=TB+hocsinh.get(i).ĐTB();
			}
		System.out.println("Điểm trung bình là " + TB/n);
	}
	
}
