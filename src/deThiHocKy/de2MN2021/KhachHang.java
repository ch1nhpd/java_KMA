package deThiHocKy.de2MN2021;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private int namSinh;
	private String diaChi,to,phuong,quan,thanhPho;
	
	ArrayList<HoaDon> hoaDons = new ArrayList<>();
	private double tongTien;
	Scanner sc = new Scanner(System.in);
	public void nhapThongTin() {
		System.out.println("Nhap ma KH: ");
		maKH = sc.nextLine();
		System.out.println("Ten KH: ");
		tenKH = sc.nextLine();
		System.out.println("Nam sinh: ");
		namSinh = Integer.parseInt(sc.nextLine());
		System.out.println("To: ");
		to = sc.nextLine();
		System.out.println("Phuong: ");
		phuong = sc.nextLine();
		System.out.println("Quan: ");
		quan = sc.nextLine();
		System.out.println("Thanh pho: ");
		thanhPho = sc.nextLine();
		setDiaChi(to, phuong, quan, thanhPho);
	}
	public String xuatThongTin() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", namSinh=" + namSinh + ", diaChi=" + diaChi + ", tong tien mua="+tongTien+"]";
	}
	
	public KhachHang() {
	}
	
	public KhachHang(String maKH, String tenKH, int namSinh, String to, String phuong, String quan, String thanhPho) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.namSinh = namSinh;
		this.to = to;
		this.phuong = phuong;
		this.quan = quan;
		this.thanhPho = thanhPho;
		diaChi = "Dia chi: to "+ to+", phuong "+ phuong+", quan "+quan+", thanh pho "+thanhPho;
	}
	
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien() {
		this.tongTien=0;
		for (HoaDon hoaDon : hoaDons) {
			this.tongTien += hoaDon.tongTien();
		}
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String to, String phuong, String quan, String thanhPho ) {
		this.diaChi = "Dia chi: to "+ to+", phuong "+ phuong+", quan "+quan+", thanh pho "+thanhPho;;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getPhuong() {
		return phuong;
	}
	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}
	public String getQuan() {
		return quan;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public String getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}

}
