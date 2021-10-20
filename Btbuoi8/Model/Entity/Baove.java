package Model.Entity;

import Model.Enum.Chucvu;
import Model.Enum.Gioitinh;

public class Baove extends Info{

	public Baove(String name, int age, Gioitinh gender, Chucvu chucvu) {
		super(name, age, gender, chucvu);
	}
	@Override
	public String toString() {
		return "ID: " + getID() + "	Tên: " + getName() + "	Tuổi: " + getAge() + "	Giới tính: "
				+ getGender().getGioiTinh() + "		Chức vụ: " + getChucvu().getChucVu();
	}
}
