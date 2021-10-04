package Mainprogram;

import java.util.List;
import java.util.Scanner;

import Entity.Apple;
import Entity.Banana;
import Entity.Fruit;
import Entity.Orange;
import Singelton.Cart;
import Singelton.Inventory;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1.Apple");
		System.out.println("2.Banana");
		System.out.println("3.Orange");
		System.out.println("Mời bạn nhập loại muốn thêm vào kho (1,2,3) : ");
		int luachon = input.nextInt();
		do {
			if (luachon == 1) {
				System.out.println("Mời bạn nhập số lượng Apple cần thêm vào kho: ");
				int soluong = input.nextInt();
				for (int i = 0; i < soluong; i++) {
					System.out.println("Mời bạn nhập tên quả: ");
					String nameTG1 = input.next();
					System.out.println("Mời bạn nhập giá: ");
					double gia1 = input.nextDouble();
					System.out.println("Mời bạn nhâp số lượng quả trong kho: ");
					int luong1 = input.nextInt();
					System.out.println("Mời bạn nhập lượng đường: ");
					int luongDuong = input.nextInt();
					Inventory.addToInventory(new Apple(nameTG1, gia1, luong1, luongDuong));
				}
			} else if (luachon == 2) {
				System.out.println("Mời bạn nhập số lượng Banana cần thêm vào kho: ");
				int soluong = input.nextInt();
				for (int i = 0; i < soluong; i++) {
					System.out.println("Mời bạn nhập tên quả: ");
					String nameTG1 = input.next();
					System.out.println("Mời bạn nhập giá: ");
					double gia1 = input.nextDouble();
					System.out.println("Mời bạn nhâp số lượng quả trong kho: ");
					int luong1 = input.nextInt();
					System.out.println("Mời bạn nhập cân nặng: ");
					double canNang = input.nextDouble();
					Inventory.addToInventory(new Banana(nameTG1, gia1, luong1, canNang));
				}
			} else if (luachon == 3) {
				System.out.println("Mời bạn nhập số lượng Orange cần thêm vào kho: ");
				int soluong = input.nextInt();
				for (int i = 0; i < soluong; i++) {
					System.out.println("Mời bạn nhập tên quả: ");
					String nameTG1 = input.next();
					System.out.println("Mời bạn nhập giá: ");
					double gia1 = input.nextDouble();
					System.out.println("Mời bạn nhâp số lượng quả trong kho: ");
					int luong1 = input.nextInt();
					System.out.println("Mời bạn nhập lượng Kali: ");
					double kali = input.nextDouble();
					Inventory.addToInventory(new Orange(nameTG1, gia1, luong1, kali));
				}
			}
			System.out.println("Bạn có muốn nhập thêm quả khác không (1,2,3) nếu không thì mời bạn nhấn phím 4: ");
			luachon = input.nextInt();
		} while (luachon <= 3);
		System.out.println("Bảng chi tiết kho");
		List<Fruit> a = Inventory.getInstance();

		for (Fruit i : a) {
			System.out.println(i);
		}
		System.out.println("1. Thêm vào giỏ hàng của bạn");
		System.out.println("2. Bổ sung quả vào trong kho");
		System.out.println("Mời bạn nhập lựa chọn (1,2): ");
		int luachon3 = input.nextInt();
		int them = 1;
		if (luachon3 == 1) {
			do {
				System.out.println("Mời bạn nhập id của quả bạn muốn thêm vào giỏ: ");
				int idSach = input.nextInt();
				System.out.println("Mời bạn nhập số lượng muốn thêm vào giỏ: ");
				int luong5 = input.nextInt();
				if (Cart.addToCart(idSach, luong5)==true) {
					System.out.println("Đã thêm vào giỏ hàng thành công !!!");
				} else {
					System.out.println("Không tìm thấy mã ID hoặc số lượng trong kho không đủ !!!");
					System.out.println("Thêm vào giỏ không thành công !!!");
				}
				System.out.println("Nếu muốn thêm vào giỏ hàng tiếp hãy nhập phím 1 nếu không hãy nhập phím 2: ");
				them = input.nextInt();
			} while (them != 2);
		} else if (luachon3 == 2) {
			them = 1;
			do {
				System.out.println("Mời bạn nhập id của quả bạn muốn thêm số lượng vào kho: ");
				int idSach = input.nextInt();
				System.out.println("Mời bạn nhập số lượng muốn thêm vào kho: ");
				int luong5 = input.nextInt();
				if (Inventory.addQuantity(idSach, luong5) == true) {
					System.out.println("Đã thêm vào kho thành công !!!");
				} else {
					System.out.println("Không tìm thấy mã ID !!!");
					System.out.println("Thêm vào kho không thành công !!!");
				}
				System.out.println("Nếu muốn thêm vào kho tiếp hãy nhập phím 1 nếu không hãy nhập phím 2: ");
				them = input.nextInt();
			} while (them != 2);
		}
		System.out.println("Bảng chi tiết kho");
		List<Fruit> b = Inventory.getInstance();

		for (Fruit i : b) {
			System.out.println(i);
		}
	}
}
