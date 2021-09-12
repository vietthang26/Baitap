package BT;

public class Laptop {
	CPU cpu;
	RAM ram;
	Mainboard mainboard;
	Branch hang;
	int soLuong;

	public Laptop(CPU cpu, RAM ram, Mainboard mainboard, Branch hang, int soLuong) {
		this.cpu = cpu;
		this.ram = ram;
		this.mainboard = mainboard;
		this.hang = hang;
		this.soLuong = soLuong;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public Mainboard getMainboard() {
		return mainboard;
	}

	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}

	public Branch getHang() {
		return hang;
	}

	public void setHang(Branch hang) {
		this.hang = hang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
}
