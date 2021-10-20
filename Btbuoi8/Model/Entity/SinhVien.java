package Model.Entity;

import Model.Enum.Chucvu;
import Model.Enum.Gioitinh;
import Model.Enum.Type;

public class SinhVien extends Info {
	private Type type;

	public SinhVien(String name, int age, Gioitinh gender, Chucvu chucvu, Type type) {
		super(name, age, gender, chucvu);
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ID: " + getID() + "	Tên: " + getName() + "	Tuổi: " + getAge() + "	Giới tính: "
				+ getGender().getGioiTinh() + "		Chức vụ: " + getChucvu().getChucVu() + " 	Loại sinh viên: "
				+ getType().getType();
	}
}
