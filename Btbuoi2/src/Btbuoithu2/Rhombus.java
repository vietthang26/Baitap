package Btbuoithu2;

import java.util.ArrayList;
import java.util.Scanner;

public class Rhombus {
	private ArrayList<Seg> lsSeg;
	
	public Rhombus() {
		lsSeg = new ArrayList<Seg>();
		Scanner input = new Scanner(System.in);
		int temp1, temp2, temp3, temp4;
		System.out.println("Mời bạn nhập cạnh hình thoi");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		lsSeg.add(new Seg(temp1, temp2, temp3, temp4));
		System.out.println("Mời bạn nhập đường chéo hình thoi");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		lsSeg.add(new Seg(temp1, temp2, temp3, temp4));
		System.out.println("Mời bạn nhập đường chéo hình thoi");
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
		double c = lsSeg.get(0).chieudaic();
		System.out.println("Chu vi là: " + (c*4));
	}
	public void dientich() {
		double c1 = lsSeg.get(1).chieudaic();
		double c2 = lsSeg.get(2).chieudaic();
		double s= 1/2*(c1+c2);
		System.out.println("Diện tích là: " + s);
	}
}
