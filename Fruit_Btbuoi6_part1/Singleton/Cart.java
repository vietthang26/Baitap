package Singleton;

import java.util.HashMap;
import java.util.Map;

import Entity.Fruit;

public class Cart {
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
		Fruit temp = Inventory.getFruit(id);
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
}
