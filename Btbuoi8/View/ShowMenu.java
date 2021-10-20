package View;

public class ShowMenu {
	static public void chonLoaiInput() {
		System.out.println("1. Sinh viên");
		System.out.println("2. Giảng viên");
		System.out.println("3. Nhân viên");
		System.out.print("Mời bạn chọn loại chức vụ muốn thêm vào danh sách: ");
	}
	static public void chonLoaiInputLich() {
		System.out.println("1. Lịch giảng dạy");
		System.out.println("2. Lịch học");
		System.out.println("3. Lịch trực");
		System.out.print("Mời bạn chọn loại lịch muốn thêm vào bảng: ");
	}
	static public void chonLoaiOutputDS() {
		System.out.println("1. Danh sách sinh viên");
		System.out.println("2. Danh sách giảng viên");
		System.out.println("3. Danh sách nhân viên");
		System.out.print("Mời bạn chọn danh sách muốn in: ");
	}
	static public void chonLoaiOutputLich() {
		System.out.println("1. Bảng lịch giảng dạy");
		System.out.println("2. Bảng lịch học");
		System.out.println("3. Bảng lịch trực");
		System.out.print("Mời bạn chọn bảng muốn in: ");
	}
	static public void TietHoc() {
		System.out.println("1. Tiết 1: 6h45-8h45");
		System.out.println("2. Tiết 2: 8h45-10h45");
		System.out.println("3. Tiết 3: 10h45-12h45");
		System.out.print("Mời bạn chọn tiết học: ");
	}

	static public void PhongHoc() {
		System.out.println("1. Phòng 1: B302");
		System.out.println("2. Phòng 2: A603");
		System.out.println("3. Phòng 3: A501");
		System.out.print("Mời bạn chọn phòng học: ");
	}

	static public void ViTri() {
		System.out.println("1. Vị trí 1: Cổng bảo vệ");
		System.out.println("2. Vị trí 2: Nhà A2");
		System.out.println("3. Vị trí 3: Giảng đường");
		System.out.print("Mời bạn chọn vị trí: ");
	}
	static public void GioiTinh() {
		System.out.println("1. Nam");
		System.out.println("2. Nữ");
		System.out.println("3. Khác");
		System.out.print("Mời bạn chọn giới tính: ");
	}
	static public void ChucVu() {
		System.out.println("1. Bảo vệ");
		System.out.println("2. Vệ sinh");
		System.out.print("Mời bạn chọn chức vụ: ");
	}
	static public void Loai() {
		System.out.println("1. Chính quy");
		System.out.println("2. Liên thông");
		System.out.println("3. Tại chức");
		System.out.print("Mời bạn chọn loại sinh viên: ");
	}
}
