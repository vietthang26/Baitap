package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Fruit> listFruit = new ArrayList<Fruit>();
		listFruit.add(new Apple("Táo đen", 10000, 2, 30));
		listFruit.add(new Apple("Táo đỏ", 20000, 1, 15));
		listFruit.add(new Apple("Táo trắng", 30000, 2, 20));
		listFruit.add(new Orange("Cam đen", 20000, 3, 3));
		listFruit.add(new Orange("Cam đỏ", 10000, 2, 2));
		listFruit.add(new Orange("Cam trắng", 15000, 2, 1));
		listFruit.add(new Banana("Chuối đen", 5000, 1, 10));
		listFruit.add(new Banana("Chuối đỏ", 10000, 2, 5));
		listFruit.add(new Banana("Chuối trắng", 40000, 3, 20));
		System.out.println("1. In ra thông tin của các loại quả hiện có");
		System.out.println("2. Nhập vào một số tiền và in ra mỗi loại hoa quả có thể mua được nhiều nhất");
		System.out.println("Mời bạn nhập lựa chọn: ");
		int a = input.nextInt();
		if (a == 1) {
			for (Fruit item : listFruit)
				System.out.println(item.toString());
		} else {
			System.out.println("Mời bạn nhập số tiền: ");
			double tien = input.nextDouble();
			int i = 0;
			for (Fruit item1 : listFruit) {
				if (item1.getGiaHoaqua() <= tien) {
					int cnt = 0;
					double tien1 = tien;
					while (tien >= 0) {
						tien = tien - item1.getGiaHoaqua();
						cnt++;
					}
					if (cnt - 1 >= item1.getSoLuong())
						System.out.println(
								item1.getTenHoaqua() + " có thể mua tối đa là: " + item1.getSoLuong() + " quả");
					else
						System.out.println(item1.getTenHoaqua() + " có thể mua tối đa là: " + (cnt - 1) + " quả");
					tien = tien1;
				}
			}
		}
	}
}
