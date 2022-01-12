package deThiHocKy.de2V2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private Date ngaySanXuat;
    private int soLuong;
    private double thanhTien;
    Scanner sc = new Scanner(System.in);
    private ArrayList<HoaDon> hoaDons = new ArrayList<>();

    public SanPham(String maSP, String tenSP, double donGia, Date ngaySanXuat, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.soLuong = soLuong;
        this.thanhTien = this.soLuong * this.donGia;
    }

    public void tangSoLuong(int soLuongCanTang){
        this.soLuong  += soLuongCanTang;
    }

    public void nhapThongTin() throws ParseException {
        System.out.println("Nhap thong tin san pham");
        System.out.println("Nhap ma: ");
        maSP = sc.nextLine();
        System.out.println("Nhap ten:");
        tenSP = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap ngay san xuat: ");
        ngaySanXuat = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        System.out.println("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", donGia=" + donGia +
                ", ngaySanXuat=" + ngaySanXuat +
                ", soLuong=" + soLuong +
                ", thanhTien=" + thanhTien +
                '}';
    }
    public void giamSoLuong(int soLuongCanGiam){
        this.soLuong -=soLuongCanGiam;
    }


    public SanPham() {
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien() {
        this.thanhTien = soLuong*donGia;
    }
}
