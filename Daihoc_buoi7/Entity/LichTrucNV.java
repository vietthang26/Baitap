package Entity;

import Enum.ViTri;

public class LichTrucNV extends LichLamViec {
	ViTri vitri;
	
	public LichTrucNV(int ID, Time time, ViTri vitri) {
		super(ID, time);
		this.vitri = vitri;
	}

	public ViTri getVitri() {
		return vitri;
	}

	public void setVitri(ViTri vitri) {
		this.vitri = vitri;
	}

	@Override
	public String toString() {
		return "ID: " + getID() + "	Thời gian: " + getTime().getTime() + "	Vị trí: " + getVitri().getVitri();
	}
}
