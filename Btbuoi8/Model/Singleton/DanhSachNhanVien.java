package Model.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.Info;

public class DanhSachNhanVien {
	static private List<Info> danhSachNV = new ArrayList<Info>();

	private DanhSachNhanVien() {

	}

	static public List<Info> getInstance(){
		return danhSachNV;
	}
	
	static public boolean addToDSNV(Info info) {
		danhSachNV.add(info);
		return true;
	}
	//Kiểm tra xem id có tồn tại trong danh sách nhân viên hay không 
		static public boolean isValid(int ID) {
			for (Info i : danhSachNV) {
				if (i.getID() == ID)
					return true;
			}
			return false;
		}
}
