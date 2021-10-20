package Model.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.Info;

public class DanhSachGiangVien {
	static private List<Info> danhSachGV = new ArrayList<Info>();

	private DanhSachGiangVien() {

	}
	
	static public List<Info> getInstance(){
		return danhSachGV;
	}
	
	static public boolean addToDSGV(Info info) {
		danhSachGV.add(info);
		return true;
	}
	//Kiểm tra xem id có tồn tại trong danh sách giảng viên hay không 
		static public boolean isValid(int ID) {
			for (Info i : danhSachGV) {
				if (i.getID() == ID)
					return true;
			}
			return false;
		}
}
