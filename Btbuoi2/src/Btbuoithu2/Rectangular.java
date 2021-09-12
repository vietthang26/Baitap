package Btbuoithu2;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangular {
	private ArrayList<Seg> lsSeg;
	
	public Rectangular() {
		lsSeg = new ArrayList<Seg>();
		Scanner input = new Scanner(System.in);
		int temp1, temp2, temp3, temp4;
		System.out.println("Mời bạn nhập chiều dài hình chữ nhật");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		lsSeg.add(new Seg(temp1, temp2, temp3, temp4));
		System.out.println("Mời bạn nhập chiều rộng hình chữ nhật");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		lsSeg.add(new Seg(temp1, temp2, temp3, temp4));
	}
	public void chuvi() {
		double chieud = lsSeg.get(0).chieudaic();
		double chieur = lsSeg.get(1).chieudaic();
		System.out.println("Chu vi là: " + (2*(chieud+chieur)));
	}
	public void dientich() {
		double chieud = lsSeg.get(0).chieudaic();
		double chieur = lsSeg.get(1).chieudaic();
		System.out.println("Diện tích là: " + (chieud*chieur));
	}
}
