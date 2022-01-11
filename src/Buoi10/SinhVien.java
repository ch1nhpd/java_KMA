package Buoi10;

import java.util.Date;
import java.util.Scanner;

public class SinhVien {
	private int currentYear = new Date().getYear();
	private String maSv;
	private String hoTen;
	private int namSinh;
	private int tuoi;
	private String lop;
	
	public void nhapThongTin(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien");
		System.out.println("Nhap MSV: ");
		maSv = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		namSinh = Integer.parseInt(sc.nextLine());
		tuoi = currentYear - namSinh;
		System.out.println("Nhap lop: ");
		lop = sc.nextLine();
		System.out.println("------------------------");
	}
	
	
	public String xuatThongTin() {
		return "\nSinhVien [currentYear=" + currentYear + ", maSv=" + maSv + ", hoTen=" + hoTen + ", namSinh=" + namSinh
				+ ", tuoi=" + tuoi + ", lop=" + lop + "]";
	}



	public SinhVien() {
	}
	
	public SinhVien(String maSv, String hoTen, int namSinh, String lop) {
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.tuoi = currentYear - namSinh;
		this.lop = lop;
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	
	
}
