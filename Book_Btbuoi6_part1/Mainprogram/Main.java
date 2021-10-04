package Mainprogram;

import java.util.List;
import java.util.Scanner;

import Entity.Book;
import Entity.English;
import Entity.Literature;
import Entity.Science;
import Singleton.Cart;
import Singleton.Inventory;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1.English");
		System.out.println("2.Literature");
		System.out.println("3.Science");
		System.out.println("Mời bạn nhập sách muốn thêm vào kho (1,2,3) : ");
		int luachon = input.nextInt();
		do {
			if (luachon == 1) {
				System.out.println("Mời bạn nhập số lượng sách English cần thêm vào kho: ");
				int soluong = input.nextInt();
				for (int i = 0; i < soluong; i++) {
					System.out.println("Mời bạn nhập tên tác giả: ");
					String nameTG1 = input.next();
					System.out.println("Mời bạn nhập giá sách: ");
					double gia1 = input.nextDouble();
					System.out.println("Mời bạn nhâp số lượng sách trong kho: ");
					int luong1 = input.nextInt();
					System.out.println("Mời bạn nhập mã ISBN: ");
					int maISBN = input.nextInt();
					Inventory.addToInventory(new English(nameTG1, gia1, luong1, maISBN));
				}
			} else if (luachon == 2) {
				System.out.println("Mời bạn nhập số lượng sách Literature cần thêm vào kho: ");
				int soluong = input.nextInt();
				for (int i = 0; i < soluong; i++) {
					System.out.println("Mời bạn nhập tên tác giả: ");
					String nameTG1 = input.next();
					System.out.println("Mời bạn nhập giá sách: ");
					double gia1 = input.nextDouble();
					System.out.println("Mời bạn nhâp số lượng sách trong kho: ");
					int luong1 = input.nextInt();
					System.out.println("Mời bạn nhập lần tái bản: ");
					int taiBan = input.nextInt();
					Inventory.addToInventory(new Literature(nameTG1, gia1, luong1, taiBan));
				}
			} else if (luachon == 3) {
				System.out.println("Mời bạn nhập số lượng sách Science cần thêm vào kho: ");
				int soluong = input.nextInt();
				for (int i = 0; i < soluong; i++) {
					System.out.println("Mời bạn nhập tên tác giả: ");
					String nameTG1 = input.next();
					System.out.println("Mời bạn nhập giá sách: ");
					double gia1 = input.nextDouble();
					System.out.println("Mời bạn nhâp số lượng sách trong kho: ");
					int luong1 = input.nextInt();
					System.out.println("Mời bạn nhập lần xuất bản: ");
					int xuatBan = input.nextInt();
					Inventory.addToInventory(new Science(nameTG1, gia1, luong1, xuatBan));
				}
			}
			System.out.println("Bạn có muốn nhập thêm sách khác không (1,2,3) nếu không thì mời bạn nhấn phím 4: ");
			luachon = input.nextInt();
		} while (luachon <= 3);
		System.out.println("Bảng chi tiết kho");
		List<Book> a = Inventory.getInstance();

		for (Book i : a) {
			System.out.println(i);
		}
		
		System.out.println("Bảng thể loại");
		List<Book> c = Inventory.getInstance();

		for (Book i : c) {
			System.out.print(i.getId()+" ");i.theLoai();
		}
		
		System.out.println("1. Thêm vào giỏ hàng của bạn");
		System.out.println("2. Bổ sung sách vào trong kho");
		System.out.println("Mời bạn nhập lựa chọn (1,2): ");
		int luachon3 = input.nextInt();
		int them = 1;
		if (luachon3 == 1) {
			do {
				System.out.println("Mời bạn nhập id của sách bạn muốn thêm vào giỏ: ");
				int idSach = input.nextInt();
				System.out.println("Mời bạn nhập số lượng muốn thêm vào giỏ: ");
				int luong5 = input.nextInt();
				if (Cart.addToCart(idSach, luong5) == true) {
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
				System.out.println("Mời bạn nhập id của sách bạn muốn thêm số lượng vào kho: ");
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
		List<Book> b = Inventory.getInstance();

		for (Book i : b) {
			System.out.println(i);
		}
	}
}
