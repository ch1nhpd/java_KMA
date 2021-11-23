package Buoi4.Bai12;

public class GiamDoc extends Nguoi{
	private double tienTieu;

	public GiamDoc() {
		super();
	}

	public GiamDoc(String name, int birthYear, String code,double tienTieu) {
		super(name, birthYear, code);
		this.tienTieu = tienTieu;
	}

	public double getTienTieu() {
		return tienTieu;
	}

	public void setTienTieu(double tienTieu) {
		this.tienTieu = tienTieu;
	}
	
	
	
}
