package Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Entity.Book;


public class Cart {
	static double thanhTien=0;
	static private Map<Integer, Integer> cart = new HashMap<Integer, Integer>();;

	private Cart() {

	}
	
	static public Map<Integer, Integer> getInstance() {
		return cart;
	}

	static public boolean addToCart(int id, int quantity) {
		// Kiểm tra id
		if (Inventory.isValid(id) == false)
			return false;
		// Kiểm tra số lượng
		Book temp = Inventory.getBook(id);
		if (temp.getQuantity() < quantity)
			return false;
		else {
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity - quantity);
		}
		// Thêm vào Cart
		if (cart.containsKey(id)) {
			int oldQuantity = cart.get(id);
			cart.put(id, oldQuantity + quantity);
		} else {
			cart.put(id, quantity);
		}
		return true;
	}
	//Thành tiền
	static public double thanhTien() {
		Map<Integer, Integer> b1 = Cart.getInstance();
		Set<Integer> k1 = b1.keySet();
		for (Integer i : k1) {
			Book temp = Inventory.getBook(i);
			thanhTien+=temp.getPrice()*b1.get(i);
		}
		return thanhTien;
	}
}
