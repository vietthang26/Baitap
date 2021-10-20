package Model.Entity;

import Model.Enum.Chucvu;
import Model.Enum.Gioitinh;

abstract public class Info {
	private int ID;
	private String name;
	private int age;
	static private int count;
	private Gioitinh gender;
	private Chucvu chucvu;

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
