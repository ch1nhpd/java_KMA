package deThiHocKy.de2MN2021;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
	private String maSP;
	private String tenSP;
	private double donGia;
	private Date ngaySanXuat;
	private int soLuong;
	private double thanhTien;
	
	private ArrayList<HoaDon> hoaDons;
	Scanner sc = new Scanner(System.in);
	
	public void nhapThongTin() throws ParseException {
		System.out.println("Nhap maSP: ");
		maSP = sc.nextLine();
		System.out.println("Ten sp: ");
		tenSP = sc.nextLine();
		System.out.println("Don gia: ");
		donGia = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap ngay san xuat: ");
		ngaySanXuat = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
		System.out.println("So luong: ");
		soLuong = Integer.parseInt(sc.nextLine());
	}
	public void nhapThongTin(String maSP) throws ParseException {
		
		this.maSP = maSP;
		System.out.println("Ten sp: ");
		tenSP = sc.nextLine();
		System.out.println("Don gia: ");
		donGia = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap ngay san xuat: ");
		ngaySanXuat = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
		System.out.println("So luong: ");
		soLuong = Integer.parseInt(sc.nextLine());
	}
	public String xuatThongTin() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", donGia=" + donGia + ", ngaySanXuat=" + ngaySanXuat
				+ ", soLuong=" + soLuong + "]";
	}
	
	public void tangSoLuong(int soLuong) {
		this.soLuong += soLuong;
	}
	public void giamSoLuong(int soLuong) {
		this.soLuong -= soLuong;
	}
	public SanPham() {
	}
	
	public SanPham(String maSP, String tenSP, double donGia, Date ngaySanXuat, int soLuong) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.ngaySanXuat = ngaySanXuat;
		this.soLuong = soLuong;
	}
	
	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien() {
		this.thanhTien = soLuong*donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	
	

}
