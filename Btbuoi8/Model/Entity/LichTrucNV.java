package Model.Entity;

import Model.Enum.Time;
import Model.Enum.Vitri;

public class LichTrucNV extends LichLamViec {
	Vitri vitri;

	public LichTrucNV(int iD, Time time, Vitri vitri) {
		super(iD, time);
		this.vitri = vitri;
	}

	public Vitri getVitri() {
		return vitri;
	}

	public void setVitri(Vitri vitri) {
		this.vitri = vitri;
	}
	@Override
	public String toString() {
		return "ID: " + getID() + "		Thời gian: " + getTime().getTime() + "		Vị trí: "+ getVitri().getVitri();
	}
}
