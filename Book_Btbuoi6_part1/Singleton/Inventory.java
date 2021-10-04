package Singleton;

import java.util.ArrayList;
import java.util.List;

import Entity.Book;


public class Inventory {
	static private List<Book> inventory = new ArrayList<Book>();;

	private Inventory() {

	}

	static public List<Book> getInstance() {
		return inventory;
	}

	// Thêm fruit vào inventory
	static public boolean addToInventory(Book book) {
		inventory.add(book);
		return true;
	}

	/**
	 * Kiểm tra id có tồn tại trong list hay không?
	 * 
	 * @param id
	 * @return boolean
	 */
	static public boolean isValid(int id) {
		for (Book i : inventory) {
			if (i.getId() == id)
				return true;
		}
		return false;
	}

	// Trả về Fruit dựa trên id
	static public Book getBook(int id) {
		return inventory.get(id - 1);
	}
	
	static public boolean addQuantity(int id, int quantity) {
		// Kiểm tra id có tồn tại hay không
		if (Inventory.isValid(id) == false)
			return false;
		// Thêm số lượng
		Book temp = Inventory.getBook(id);
		temp.addQuantity(quantity);
		return true;
	}
}
