package MainPro;

import java.util.List;
import java.util.Scanner;

import Entity.BaoVe;
import Entity.GiangVien;
import Entity.Info;
import Entity.LichGiangDay;
import Entity.LichHoc;
import Entity.LichLamViec;
import Entity.LichLamViec.Time;
import Entity.LichTrucNV;
import Entity.SinhVien;
import Entity.VeSinh;
import Enum.Chucvu;
import Enum.Gioitinh;
import Enum.PhongHoc;
import Enum.Type;
import Enum.ViTri;
import Singleton.BangLichGD;
import Singleton.BangLichHoc;
import Singleton.BangLichTruc;
import Singleton.DanhSachGiangVien;
import Singleton.DanhSachNhanVien;
import Singleton.DanhSachSinhVien;

public class Main {
	static public void showTietHoc() {
		System.out.println("1. Tiết 1: 6h45-8h45");
		System.out.println("2. Tiết 2: 8h45-10h45");
		System.out.println("3. Tiết 3: 10h45-12h45");
		System.out.println("Mời bạn chọn tiết học: ");
	}

	static public void showPhongHoc() {
		System.out.println("1. Phòng 1: B302");
		System.out.println("2. Phòng 2: A603");
		System.out.println("3. Phòng 3: A501");
		System.out.println("Mời bạn chọn phòng học: ");
	}

	static public void showViTri() {
		System.out.println("1. Vị trí 1: Cổng bảo vệ");
		System.out.println("2. Vị trí 2: Nhà A2");
		System.out.println("3. Vị trí 3: Giảng đường");
		System.out.println("Mời bạn chọn vị trí: ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Thêm 3 sinh viên vào danh sách sinh viên
		DanhSachSinhVien.addToDSSV(new SinhVien("Thắng", 19, Gioitinh.NAM, Chucvu.SINHVIEN, Type.CHINHQUY));
		DanhSachSinhVien.addToDSSV(new SinhVien("Xuân", 19, Gioitinh.NAM, Chucvu.SINHVIEN, Type.LIENTHONG));
		DanhSachSinhVien.addToDSSV(new SinhVien("Phan Anh", 19, Gioitinh.NAM, Chucvu.SINHVIEN, Type.TAICHUC));

		// Thêm 3 nhân viên vào danh sách nhân viên
		DanhSachNhanVien.addToDSNV(new BaoVe("Bảo vệ 1", 35, Gioitinh.NAM, Chucvu.BAOVE));
		DanhSachNhanVien.addToDSNV(new VeSinh("Vệ sinh 1", 32, Gioitinh.NU, Chucvu.VESINH));
		DanhSachNhanVien.addToDSNV(new BaoVe("Bảo vệ 2", 30, Gioitinh.NU, Chucvu.BAOVE));

		// Thêm 3 giảng viên vào danh sách giảng viên
		DanhSachGiangVien.addToDSGV(new GiangVien("Giảng Viên 1", 30, Gioitinh.NAM, Chucvu.GIANGVIEN));
		DanhSachGiangVien.addToDSGV(new GiangVien("Giảng Viên 2", 31, Gioitinh.NAM, Chucvu.GIANGVIEN));
		DanhSachGiangVien.addToDSGV(new GiangVien("Giảng Viên 3", 32, Gioitinh.NU, Chucvu.GIANGVIEN));

		List<Info> a = DanhSachSinhVien.getInstance();
		for (Info i : a) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------------------------------------------");
		List<Info> b = DanhSachNhanVien.getInstance();
		for (Info i : b) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------------------------------------------");
		List<Info> c = DanhSachGiangVien.getInstance();
		for (Info i : c) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Tạo các bảng lịch");
		int tieptuc = 1;
		do {
		System.out.println("1. Bảng lịch giảng dạy");
		System.out.println("2. Bảng lịch học");
		System.out.println("3. Bảng lịch trực");
		System.out.println("Bạn muốn thêm vào bảng lịch nào: ");
		int themVao = input.nextInt();
		if (themVao == 1) {
			// Tạo bảng giảng dạy
			System.out.println("Tạo bảng lịch Giảng dạy");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Mời bạn nhập ID: ");
			int id = input.nextInt();
			if (DanhSachGiangVien.isValid(id) == true) {
				showTietHoc();
				int chonTiet = input.nextInt();
				switch (chonTiet) {
				case 1:
					showPhongHoc();
					int chonPhong1 = input.nextInt();
					switch (chonPhong1) {
					case 1:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET1, PhongHoc.P1));
						break;
					case 2:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET1, PhongHoc.P2));
						break;
					case 3:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET1, PhongHoc.P3));
						break;
					}
					break;
				case 2:
					showPhongHoc();
					int chonPhong2 = input.nextInt();
					switch (chonPhong2) {
					case 1:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET2, PhongHoc.P1));
						break;
					case 2:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET2, PhongHoc.P2));
						break;
					case 3:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET2, PhongHoc.P3));
						break;
					}
					break;
				case 3:
					showPhongHoc();
					int chonPhong3 = input.nextInt();
					switch (chonPhong3) {
					case 1:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET3, PhongHoc.P1));
						break;
					case 2:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET3, PhongHoc.P2));
						break;
					case 3:
						BangLichGD.addToBangLGD(new LichGiangDay(id, Time.TIET3, PhongHoc.P3));
						break;
					}
					break;
				}
			} else {
				System.out.println("ID không tồn tại trong danh sách sinh viên !!!");
			}
		}
		// Tạo bảng học
		else if (themVao == 2) {
			System.out.println("Tạo bảng lịch học");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Mời bạn nhập ID: ");
			int id = input.nextInt();
			if (DanhSachSinhVien.isValid(id) == true) {
				showTietHoc();
				int chonTiet = input.nextInt();
				switch (chonTiet) {
				case 1:
					showPhongHoc();
					int chonPhong1 = input.nextInt();
					switch (chonPhong1) {
					case 1:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET1, PhongHoc.P1));
						break;
					case 2:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET1, PhongHoc.P2));
						break;
					case 3:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET1, PhongHoc.P3));
						break;
					}
					break;
				case 2:
					showPhongHoc();
					int chonPhong2 = input.nextInt();
					switch (chonPhong2) {
					case 1:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET2, PhongHoc.P1));
						break;
					case 2:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET2, PhongHoc.P2));
						break;
					case 3:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET2, PhongHoc.P3));
						break;
					}
					break;
				case 3:
					showPhongHoc();
					int chonPhong3 = input.nextInt();
					switch (chonPhong3) {
					case 1:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET3, PhongHoc.P1));
						break;
					case 2:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET3, PhongHoc.P2));
						break;
					case 3:
						BangLichHoc.addToBangLH(new LichHoc(id, Time.TIET3, PhongHoc.P3));
						break;
					}
					break;
				}
			} else {
				System.out.println("ID không tồn tại trong danh sách sinh viên !!!");
			}
		}
		// Tạo bảng lịch trực
				else if (themVao == 3) {
					System.out.println("Tạo bảng lịch trực");
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("Mời bạn nhập ID: ");
					int id = input.nextInt();
					if (DanhSachNhanVien.isValid(id) == true) {
						showTietHoc();
						int chonTime = input.nextInt();
						switch (chonTime) {
						case 1:
							showViTri();
							int chonVitri1 = input.nextInt();
							switch (chonVitri1) {
							case 1:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET1, ViTri.VITRI1));
								break;
							case 2:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET1, ViTri.VITRI2));
								break;
							case 3:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET1, ViTri.VITRI3));
								break;
							}
							break;
						case 2:
							showViTri();
							int chonVitri2 = input.nextInt();
							switch (chonVitri2) {
							case 1:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET2, ViTri.VITRI1));
								break;
							case 2:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET2,ViTri.VITRI2));
								break;
							case 3:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET2, ViTri.VITRI3));
								break;
							}
							break;
						case 3:
							showViTri();
							int chonVitri3 = input.nextInt();
							switch (chonVitri3) {
							case 1:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET3, ViTri.VITRI1));
								break;
							case 2:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET3, ViTri.VITRI2));
								break;
							case 3:
								BangLichTruc.addToBangLT(new LichTrucNV(id, Time.TIET3, ViTri.VITRI3));
								break;
							}
							break;
						}
					} else {
						System.out.println("ID không tồn tại trong danh sách sinh viên !!!");
					}
				}
			System.out.println("Nếu muốn tạo bảng tiếp nhấn phím 1 nếu không nhấn phím 2");
			tieptuc = input.nextInt();
		} while (tieptuc!=2);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Bảng lịch Giảng dạy");
		List<LichLamViec> d = BangLichGD.getInstance();
		for (LichLamViec i : d) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Bảng lịch Học");
		List<LichLamViec> e = BangLichHoc.getInstance();
		for (LichLamViec i : e) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Bảng lịch Trực");
		List<LichLamViec> f = BangLichTruc.getInstance();
		for (LichLamViec i : f) {
			System.out.println(i);
		}
	}
}
