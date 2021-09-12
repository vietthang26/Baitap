package Mainc;

import java.util.ArrayList;
import java.util.Scanner;

import BT.Branch;
import BT.CPU;
import BT.Laptop;
import BT.Mainboard;
import BT.RAM;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Branch> lst_Hang = new ArrayList<Branch>();
		System.out.println("Mời bạn nhập số lượng hãng laptop: ");
		int slHang = input.nextInt();
		for (int i = 0; i < slHang; i++) {
			System.out.println("Mời bạn nhập hãng laptop thứ " + (i + 1));
			String hang1 = input.next();
			Branch hang = new Branch(hang1);
			lst_Hang.add(hang);
		}

		ArrayList<CPU> lst_CPU = new ArrayList<CPU>();
		System.out.println("Mời bạn nhập số lượng CPU: ");
		int slCpu = input.nextInt();
		for (int i = 0; i < slCpu; i++) {
			System.out.println("Mời bạn nhập tên CPU thứ " + (i + 1));
			String ten1 = input.next();
			CPU cpu = new CPU(ten1, lst_Hang.get(i));
			lst_CPU.add(cpu);
		}

		ArrayList<RAM> lst_Ram = new ArrayList<RAM>();
		System.out.println("Mời bạn nhập số lượng RAM: ");
		int slRam = input.nextInt();
		for (int i = 0; i < slRam; i++) {
			System.out.println("Mời bạn nhập tên RAM thứ " + (i + 1));
			String ten2 = input.next();
			RAM ram = new RAM(ten2, lst_Hang.get(i));
			lst_Ram.add(ram);
		}

		ArrayList<Mainboard> lst_Mainboard = new ArrayList<Mainboard>();
		System.out.println("Mời bạn nhập số lượng Mainboard: ");
		int slMainboard = input.nextInt();
		for (int i = 0; i < slMainboard; i++) {
			System.out.println("Mời bạn nhập tên Mainboard thứ " + (i + 1));
			String ten3 = input.next();
			Mainboard mainboard = new Mainboard(ten3, lst_Hang.get(i));
			lst_Mainboard.add(mainboard);
		}

		ArrayList<Laptop> lst_lapTop = new ArrayList<Laptop>();
		System.out.println("Mời bạn nhập số lượng laptop: ");
		int slLaptop = input.nextInt();
		for (int i = 0; i < slLaptop; i++) {
			System.out.println("Mời bạn nhập số lượng tồn kho của laptop thứ " + (i + 1));
			int tonkho = input.nextInt();
			Laptop laptop = new Laptop(lst_CPU.get(i), lst_Ram.get(i), lst_Mainboard.get(i), lst_Hang.get(i), tonkho);
			lst_lapTop.add(laptop);
		}

		for (int i = 0; i < slLaptop; i++) {
			System.out.println("Máy laptop thứ " + (i + 1) + " có chi tiết là ");
			System.out.printf("%s %s %s %s %d \n", lst_lapTop.get(i).getHang().getName(),
					lst_lapTop.get(i).getCpu().getName(), lst_lapTop.get(i).getRam().getName(),
					lst_lapTop.get(i).getMainboard().getName(), lst_lapTop.get(i).getSoLuong());
		}

	}
}
