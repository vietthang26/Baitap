package Singleton;

import java.util.ArrayList;
import java.util.List;
import Entity.Info;

public class DanhSachSinhVien {
	static private List<Info> danhSachSV = new ArrayList<Info>();

	private DanhSachSinhVien() {

	}

	static public List<Info> getInstance(){
		return danhSachSV;
	}
	
	static public boolean addToDSSV(Info info) {
		danhSachSV.add(info);
		return true;
	}
	//Kiểm tra xem id có tồn tại trong danh sách sinh viên hay không 
	static public boolean isValid(int ID) {
		for (Info i : danhSachSV) {
			if (i.getID() == ID)
				return true;
		}
		return false;
	}
}
