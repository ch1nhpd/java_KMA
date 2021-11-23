package Buoi4.Bai12;

public class SinhVien extends Nguoi{
	private double tienNo;

	public SinhVien() {
		super();
	}

	public SinhVien(String name, int birthYear, String code,double tienNo) {
		super(name, birthYear, code);
		this.tienNo = tienNo;
	}

	public double getTienNo() {
		return tienNo;
	}

	public void setTienNo(double tienNo) {
		this.tienNo = tienNo;
	}
	
	

}
