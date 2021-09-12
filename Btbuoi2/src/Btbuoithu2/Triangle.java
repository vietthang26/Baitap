package Btbuoithu2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.Segment;

public class Triangle {
	private ArrayList<Seg> lsSeg;
	
	public void nhap() {
		lsSeg = new ArrayList<Seg>();
		Scanner input = new Scanner(System.in);
		int temp1, temp2, temp3, temp4;
		System.out.println("Mời bạn nhập cạnh thứ nhất hình tam giác");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		lsSeg.add(new Seg(temp1, temp2, temp3, temp4));
		System.out.println("Mời bạn nhập cạnh thứ hai hình tam giác");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		lsSeg.add(new Seg(temp1, temp2, temp3, temp4));
		System.out.println("Mời bạn nhập cạnh thứ ba hình tam giác");
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
		double c1 = lsSeg.get(0).chieudaic();
		double c2 = lsSeg.get(1).chieudaic();
		double c3 = lsSeg.get(2).chieudaic();
		System.out.println("Chu vi là: " + (c1+c2+c3));
	}
	public void dientich() {
		double c1 = lsSeg.get(0).chieudaic();
		double c2 = lsSeg.get(1).chieudaic();
		double c3 = lsSeg.get(2).chieudaic();
		double nuachuvi=(c1+c2+c3)/2;
		System.out.println("Diện tích là: " + Math.sqrt(nuachuvi*(nuachuvi-c1)*(nuachuvi-c2)*(nuachuvi-c3)));
	}
}
