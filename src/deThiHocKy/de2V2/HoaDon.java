package deThiHocKy.de2V2;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon {
    private String maHD;
    private String maKH;
    ArrayList<SanPham> sanPhams = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public double tongTienCuaHoaDon(){
        double tong = 0;
        for (SanPham sanPham:sanPhams) {
            tong+=sanPham.getThanhTien();
        }
        return tong;
    }

//    public void nhapSanPhamCanMua(){
//        while (true){
//            SanPham sanPhamCanMua = new SanPham();
//            System.out.println("Nhap ma sp can mua: ");
//            String maSPCanMua = sc.nextLine();
//
//        }
//    }
//    public int timKiemSanPham(String maSP, ArrayList<SanPham> sps){
//        for (int i = 0 ; i<sps.size();++i) {
//            if(sps.get(i).getMaSP().equalsIgnoreCase(maSP)){
//                return i;
//            }
//        }
//        return -1;
//    }


    public HoaDon( String maKH,String maHD) {
        this.maHD = maHD;
        this.maKH = maKH;
    }

    public HoaDon(String maHD) {
        this.maHD = maHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
}
