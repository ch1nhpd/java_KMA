package test;

public class main {

	public static void main(String[] args) {
		DaGiac dg = new TamGiac();
		dg.nhap();
		System.out.println("Chu vi la: "+ dg.tinhChuVi());
		System.out.println("Dien tich la: "+dg.tinhDienTinh());
		dg.hienThi();
	}

}
