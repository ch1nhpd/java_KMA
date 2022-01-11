package test;

public class TamGiac extends DaGiac{

	@Override
	public double tinhDienTinh() {
		double nuaCV = tinhChuVi()/2;
		double dienTich = nuaCV*(nuaCV-doDai[0])*(nuaCV-doDai[1])*(nuaCV-doDai[2]);
		return Math.sqrt(dienTich);
	}
}
