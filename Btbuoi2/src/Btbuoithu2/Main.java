package Btbuoithu2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {int luachon1,luachon2;
	Scanner input = new Scanner(System.in);
	System.out.println("1.Tính chu vi, diện tích hình");
	System.out.println("2.Tính điểm trung bình môn");
	System.out.println("Mời bạn nhập lựa chọn: "); 
	luachon1= input.nextInt();
	if (luachon1==1) {
		System.out.println("1.Tính chu vi, diện tích hình vuông");
		System.out.println("2.Tính chu vi, diện tích hình bình hành");
		System.out.println("3.Tính chu vi, diện tích hình chữ nhật");
		System.out.println("4.Tính chu vi, diện tích hình tam giác");
		System.out.println("5.Tính chu vi, diện tích hình thoi");
		System.out.println("Mời bạn nhập lựa chọn: "); 
		luachon2= input.nextInt();
		switch (luachon2) {
				case 1: {
					Square hinhvuong = new Square();
					hinhvuong.chuvi();
					hinhvuong.dientich();
					break;
				}
				case 2: {
					Parallelogram hinhbinhhanh = new Parallelogram();
					hinhbinhhanh.chuvi();
					hinhbinhhanh.dientich();
					break;
				}
				case 3: {
					Rectangular hinhchunhat = new Rectangular();
					hinhchunhat.chuvi();
					hinhchunhat.dientich();
					break;
				}
				case 4: {
					Triangle hinhtamgiac = new Triangle();
					hinhtamgiac.chuvi();
					hinhtamgiac.dientich();
					break;
				}
				case 5: {
					Rhombus hinhthoi = new Rhombus();
					hinhthoi.chuvi();
					hinhthoi.dientich();
					break;
				}
			default: System.out.println("Bạn đã nhập sai !!!");
		}
	}
	else if (luachon1==2){
		Nhaphocsinh hocsinhmoi = new Nhaphocsinh();
	}
	else System.out.println("Bạn đã nhập sai !!!");
}
}
