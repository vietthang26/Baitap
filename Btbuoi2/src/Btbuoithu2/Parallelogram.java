package Btbuoithu2;

import java.util.ArrayList;
import java.util.Scanner;

public class Parallelogram {
	private ArrayList<Seg> lsSeg;
	
	public Parallelogram() {
		lsSeg = new ArrayList<Seg>();
		Scanner input = new Scanner(System.in);
		int temp1, temp2, temp3, temp4;
		System.out.println("Mời bạn nhập cạnh đáy hình bình hành");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		lsSeg.add(new Seg(temp1, temp2, temp3, temp4));
		System.out.println("Mời bạn nhập cạnh bên hình bình hành");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		lsSeg.add(new Seg(temp1, temp2, temp3, temp4));
		System.out.println("Mời bạn nhập chiều cao hình bình hành");
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
		double canh1 = lsSeg.get(0).chieudaic();
		double canh2 = lsSeg.get(1).chieudaic();
		System.out.println("Chu vi là: " + (2*(canh1+canh2)));
	}
	public void dientich() {
		double canh2 = lsSeg.get(1).chieudaic();
		double chieuc = lsSeg.get(2).chieudaic();
		System.out.println("Diện tích là: " + (canh2*chieuc));
	}
}
