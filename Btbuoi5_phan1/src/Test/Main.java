package Test;

import java.util.Scanner;

import Class.Parallelogram;
import Class.Rectangle;
import Class.Square;
import Class.Triangle;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Square");
		System.out.println("2. Triangle");
		System.out.println("3. Rectangle");
		System.out.println("4. Parallelogram");
		System.out.println("Mời bạn chọn hình: ");
		int a = input.nextInt();
		switch(a) {
		case 1:
			Square hinhVuong = new Square();
			System.out.println("Hình bạn chọn có " + hinhVuong.getNumberofSides() + " cạnh");
			System.out.println("Mời bạn nhập cạnh hình vuông: ");
			int a1 = input.nextInt();
			System.out.println("Chu vi của hình là: "+hinhVuong.chuVi(a1));
			System.out.println("Diện tích của hình là: "+hinhVuong.dienTich(a1));
			break;
		case 2:
			Triangle hinhTamgiac = new Triangle();
			System.out.println("Hình bạn chọn có " + hinhTamgiac.getNumberofSides() + " cạnh");
			System.out.println("Mời bạn nhập cạnh thứ nhất: ");
			int b1 = input.nextInt();
			System.out.println("Mời bạn nhập cạnh thứ hai: ");
			int b2 = input.nextInt();
			System.out.println("Mời bạn nhập cạnh thứ ba: ");
			int b3 = input.nextInt();
			System.out.println("Chu vi của hình là: "+hinhTamgiac.chuVi(b1,b2,b3));
			System.out.println("Diện tích của hình là: "+hinhTamgiac.dienTich(b1,b2,b3));
			break;
		case 3:
			Rectangle hinhChunhat = new Rectangle();
			System.out.println("Hình bạn chọn có " + hinhChunhat.getNumberofSides() + " cạnh");
			System.out.println("Mời bạn nhập chiều dài: ");
			int c1 = input.nextInt();
			System.out.println("Mời bạn nhập chiều rộng: ");
			int c2 = input.nextInt();
			System.out.println("Chu vi của hình là: "+hinhChunhat.chuVi(c1,c2));
			System.out.println("Diện tích của hình là: "+hinhChunhat.dienTich(c1,c2));
			break;
		case 4:
			Parallelogram hinhBinhhanh = new Parallelogram();
			System.out.println("Hình bạn chọn có " + hinhBinhhanh.getNumberofSides() + " cạnh");
			System.out.println("Mời bạn nhập cạnh đáy: ");
			int d1 = input.nextInt();
			System.out.println("Mời bạn nhập cạnh bên: ");
			int d2 = input.nextInt();
			System.out.println("Mời bạn nhập chiều cao: ");
			int d3 = input.nextInt();
			System.out.println("Chu vi của hình là: "+hinhBinhhanh.chuVi(d1,d2));
			System.out.println("Diện tích của hình là: "+hinhBinhhanh.dienTich(d3,d1));
			break;
		default: System.out.println("Bạn đã nhập sai !!!");
		}
		
	}
	
}
