package test;

import java.util.Scanner;


public class DaGiac {
	int soCanh;
	double[] doDai;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so canh: ");
		soCanh = sc.nextInt();
		doDai = new double[soCanh];
		
		for(int i = 0; i<soCanh; i++) {
			System.out.println("Nhap do dai: " );
			doDai[i] = sc.nextDouble();
		}
	}
	
	public double tinhChuVi() {
		double chuVi = 0;
		for(int i =0;i<soCanh;++i) {
			//chuVi = chuVi + doDai[i];
			chuVi += doDai[i];
		}
		return chuVi;
	}
	
	public double tinhDienTinh() {
		return 0;
	}
	
	public void hienThi() {
		for(int i =0;i<soCanh;++i) {
			System.out.println(doDai[i]);
		}
	}

}
