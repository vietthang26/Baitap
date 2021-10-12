package Entity;

import Enum.Chucvu;
import Enum.Gioitinh;

public class BaoVe extends Info {

	public BaoVe(String name, int age, Gioitinh gender, Chucvu chucvu) {
		super(name, age, gender, chucvu);
	}

	@Override
	public String toString() {
		return "ID:" + getID() + "	Tên: " + getName() + "		Tuổi: " + getAge() + "	Giới tính: " + getGender().getGioiTinh()
				+ "	Chức vụ: " + getChucvu().getChucVu();
	}
}
