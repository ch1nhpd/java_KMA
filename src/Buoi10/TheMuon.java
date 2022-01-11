package Buoi10;

import java.util.Scanner;

public class TheMuon {
	private int soPhieuMuon;
	private String ngayMuon;
	private String hanTra;
	private String soHieuSach;
	private SinhVien thongTinRieng; // luu ma sv (1-1)
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin ve the muon");
		System.out.println("Nhap ma the muon: ");
		soPhieuMuon = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ngay muon: ");
		ngayMuon = sc.nextLine();
		System.out.println("Nhap han tra: ");
		hanTra = sc.nextLine();
		System.out.println("Nhap so hieu sach: ");
		soHieuSach = sc.nextLine();
		System.out.println("Nhap thong tin SV: ");
		thongTinRieng = new SinhVien();
		thongTinRieng.nhapThongTin();
		System.out.println("---------------------------");
		sc.close();
	}
	

	public String xuatThongTin() {
		return "\nTheMuon [soPhieuMuon=" + soPhieuMuon + ", ngayMuon=" + ngayMuon + ", hanTra=" + hanTra + ", soHieuSach="
				+ soHieuSach + ", thongTinRieng=" + thongTinRieng.xuatThongTin() + "]";
	}

	public TheMuon(int soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach, SinhVien thongTinRieng) {
		this.soPhieuMuon = soPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.soHieuSach = soHieuSach;
		this.thongTinRieng = thongTinRieng;
	}
	
	public TheMuon() {
	}
	
	public int getSoPhieuMuon() {
		return soPhieuMuon;
	}
	public void setSoPhieuMuon(int soPhieuMuon) {
		this.soPhieuMuon = soPhieuMuon;
	}
	public String getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(String ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	public String getHanTra() {
		return hanTra;
	}
	public void setHanTra(String hanTra) {
		this.hanTra = hanTra;
	}
	public String getSoHieuSach() {
		return soHieuSach;
	}
	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}
	public SinhVien getThongTinRieng() {
		return thongTinRieng;
	}
	public void setThongTinRieng(SinhVien thongTinRieng) {
		this.thongTinRieng = thongTinRieng;
	}

	
}
