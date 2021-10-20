package Model.Entity;

import Model.Enum.Chucvu;
import Model.Enum.Gioitinh;

public class Giangvien extends Info {

	public Giangvien(String name, int age, Gioitinh gender, Chucvu chucvu) {
		super(name, age, gender, chucvu);
	}

	@Override
	public String toString() {
		return "ID: " + getID() + "	Tên: " + getName() + "	Tuổi: " + getAge() + "	Giới tính: "
				+ getGender().getGioiTinh() + "		Chức vụ: " + getChucvu().getChucVu();
	}
}
