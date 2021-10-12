package Entity;

import Enum.Chucvu;
import Enum.Gioitinh;

abstract public class Info {
	private int ID;
	private String name;
	private int age;
	static private int count;
	Gioitinh gender;
	Chucvu chucvu;

	public Info(String name, int age, Gioitinh gender, Chucvu chucvu) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.chucvu = chucvu;
		this.ID = ++count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Info.count = count;
	}

	public Gioitinh getGender() {
		return gender;
	}

	public void setGender(Gioitinh gender) {
		this.gender = gender;
	}

	public Chucvu getChucvu() {
		return chucvu;
	}

	public void setChucvu(Chucvu chucvu) {
		this.chucvu = chucvu;
	}

	public int getID() {
		return ID;
	}

}
