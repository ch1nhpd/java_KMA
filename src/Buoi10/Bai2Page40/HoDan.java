package Buoi10.Bai2Page40;

import java.util.Scanner;

public class HoDan {

	private int soThanhVien;
	private int soNha;
	private NhanSu thanhViens[];
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong thanh vien: ");
		soThanhVien = Integer.parseInt(sc.nextLine());
		thanhViens= new NhanSu[soThanhVien];
		System.out.print("Nhap so nha: ");
		soNha = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap cac thanh vien");
		setThanhViens();
		System.out.println("---------------------------");
	}
	
	public String xuatThongTin() {
		StringBuilder sb = new StringBuilder();
		sb.append("HoDan[ So nha: "+soNha+" So luong thanh vien: "+soThanhVien+ " Bao gom: \n");
		sb.append(getThanhViens());
		return sb + "";
	}
	
	public HoDan() {
	}
	
	public HoDan(int soThanhVien) {
		this.soThanhVien = soThanhVien;
		thanhViens = new NhanSu[soThanhVien];
	}
	public HoDan(int soThanhVien, int soNha) {
		this.soThanhVien = soThanhVien;
		thanhViens = new NhanSu[soThanhVien];
		this.soNha = soNha;
	}
	public int getSoThanhVien() {
		return soThanhVien;
	}
	public void setSoThanhVien(int soThanhVien) {
		this.soThanhVien = soThanhVien;
	}
	public int getSoNha() {
		return soNha;
	}
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	
	public void setThanhViens() {
		for(int i = 0; i< soThanhVien;++i) {
			thanhViens[i] = new NhanSu();
			System.out.println("Nhap thong tin nhan su " + (i+1));
			thanhViens[i].nhapThongTin();
		}
	}
	public String getThanhViens() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< soThanhVien;++i) {
			sb.append(thanhViens[i].xuatThongTin()+"\n");
		}
		return sb + "";
	}
}
