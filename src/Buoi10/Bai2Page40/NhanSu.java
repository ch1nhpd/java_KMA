package Buoi10.Bai2Page40;

import java.util.Scanner;

public class NhanSu {

	private String hoTen;
	private int namSinh;
	private String ngheNghiep;
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nam sinh: ");
		namSinh = Integer.parseInt(sc.nextLine());
		System.out.print("Nghe nghiep: ");
		ngheNghiep = sc.nextLine();
		System.out.println("---------------------------");
		
	}
	
	
	public String xuatThongTin() {
		return "NhanSu [hoTen=" + hoTen + ", namSinh=" + namSinh + ", ngheNghiep=" + ngheNghiep + "]";
	}



	public NhanSu() {
	}
	
	public NhanSu(String hoTen, int namSinh, String ngheNghiep) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.ngheNghiep = ngheNghiep;
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
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	
	
}
