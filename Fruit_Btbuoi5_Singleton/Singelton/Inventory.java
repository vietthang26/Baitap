package Singelton;

import java.util.ArrayList;
import java.util.List;

import Entity.Fruit;


public class Inventory {
	static private List<Fruit> inventory = new ArrayList<Fruit>();;

	private Inventory() {

	}

	static public List<Fruit> getInstance() {
		return inventory;
	}

	// Thêm fruit vào inventory
	static public boolean addToInventory(Fruit fruit) {
		inventory.add(fruit);
		return true;
	}

	/**
	 * Kiểm tra id có tồn tại trong list hay không?
	 * 
	 * @param id
	 * @return boolean
	 */
	static public boolean isValid(int id) {
		for (Fruit i : inventory) {
			if (i.getId() == id)
				return true;
		}
		return false;
	}

	// Trả về Fruit dựa trên id
	static public Fruit getFruit(int id) {
		return inventory.get(id - 1);
	}

	static public boolean addQuantity(int id, int quantity) {
		// Kiểm tra id có tồn tại hay không
		if (Inventory.isValid(id) == false)
			return false;
		// Thêm số lượng
		Fruit temp = Inventory.getFruit(id);
		temp.addQuantity(quantity);
		return true;
	}
}
