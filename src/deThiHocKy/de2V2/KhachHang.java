package deThiHocKy.de2V2;
import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private int namSinh;
    private String diaChi,to,phuong,quan,thanhPho;

    Scanner sc = new Scanner(System.in);
    ArrayList<HoaDon> hoaDons = new ArrayList<>();

    public double tongTienCuaKhachHang(){
        double tong=0;
        for (HoaDon hoaDon: hoaDons) {
            tong += hoaDon.tongTienCuaHoaDon();
        }
        return tong;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH='" + maKH + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", namSinh=" + namSinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public void nhapThongTin(){
        System.out.println("Nhap ma KH: ");
        maKH = sc.nextLine();
        System.out.println("Nhap ten: ");
        tenKH = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap to: ");
        to = sc.nextLine();
        System.out.println("Nhap phuong: ");
        phuong = sc.nextLine();
        System.out.println("Nhap quan: ");
        quan = sc.nextLine();
        System.out.println("Nhap thanhPho: ");
        thanhPho = sc.nextLine();
        diaChi = "To: "+ to+", Phuong: "+phuong+", Quan: "+quan+",Thanh Pho: "+thanhPho;
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

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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
