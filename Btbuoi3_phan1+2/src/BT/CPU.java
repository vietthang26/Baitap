package BT;

public class CPU {
	private String name;
	private Branch hang;
	
	public CPU(String name, Branch hang) {
		this.name = name;
		this.hang = hang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branch getHang() {
		return hang;
	}

	public void setHang(Branch hang) {
		this.hang = hang;
	}

	
	
}
