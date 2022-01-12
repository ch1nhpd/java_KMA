package deThiHocKy.de2V2;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    Scanner sc = new Scanner(System.in);
    ArrayList<KhachHang> khachHangs = new ArrayList<>();
    ArrayList<HoaDon> hoaDons = new ArrayList<>();
    ArrayList<SanPham> sanPhams = new ArrayList<>();

    public boolean muaHang(){
        System.out.println("Nhap ma khach hang: ");
        String maKH = sc.nextLine();
        int indexKH = timKhachHang(maKH);
        if(indexKH==-1){
            System.out.println("Ma khach hang khong hop le!");
            return  false;
        }
        HoaDon hoaDonMoi = new HoaDon(maKH,"HD"+hoaDons.size());
        int muaTiep=1;
        while(muaTiep==1){
            System.out.println("Nhap ma SP can mua: ");
            String maSP = sc.nextLine();
            int index = timKiemSanPham(maSP);
            if(index!=-1 ){
                //mua
                System.out.println("Nhap so luong can mua: ");
                int soLuong = Integer.parseInt(sc.nextLine());
                SanPham sptimThay = sanPhams.get(index);//sp trong kho
                SanPham spTrongHoaDon = new SanPham(sptimThay.getMaSP(),sptimThay.getTenSP(),sptimThay.getDonGia(),sptimThay.getNgaySanXuat(),soLuong);

                if(spTrongHoaDon.getSoLuong()<=sptimThay.getSoLuong()){
                    hoaDonMoi.sanPhams.add(spTrongHoaDon);
                    sptimThay.giamSoLuong(soLuong);
                }
            }else{
                System.out.println("San pham khong ton tai");
            }

            System.out.println("Mua tiep? (1/0): ");
            muaTiep = Integer.parseInt(sc.nextLine());

        }
        hoaDons.add(hoaDonMoi);
        khachHangs.get(indexKH).hoaDons.add(hoaDonMoi);
        return true;
    }

    public String khachHangVip(){//mua nhieu tien nhat
        double tienMax = khachHangs.get(0).tongTienCuaKhachHang();
        int viTriMax =0;
        for(int i =0;i<khachHangs.size();++i){
            double tienCuaOngI = khachHangs.get(i).tongTienCuaKhachHang();
            if(tienCuaOngI>tienMax){
                tienMax = tienCuaOngI;
                viTriMax = i;
            }
        }
        return khachHangs.get(viTriMax).toString();
    }



    public int timKhachHang(String maKH){
        for (int i = 0 ; i<khachHangs.size();++i) {
            if(khachHangs.get(i).getMaKH().equalsIgnoreCase(maKH)){
                return i;
            }
        }
        return -1;
    }

    public void inTatCaSanPham(){
        for (SanPham sanPham: sanPhams) {
            System.out.println(sanPham.toString());
        }
    }
    public void nhapSanPham() throws ParseException {

        System.out.println("Nhap ma sp moi: ");
        String maSPMoi = sc.nextLine();
        int index = timKiemSanPham(maSPMoi);
        if( index == -1){
            SanPham sanPhamMoi = new SanPham();
            sanPhamMoi.nhapThongTin();
            sanPhams.add(sanPhamMoi);
        }else{
            System.out.println("Nhap so luong can them: ");
            int soLuong = Integer.parseInt(sc.nextLine());
            sanPhams.get(index).tangSoLuong(soLuong);
        }
    }

    public  void suaSanPham(){
        System.out.println("Nhap ma san pham can sua: ");
        String maSPCanSua = sc.nextLine();
        int index = timKiemSanPham(maSPCanSua);
        if(index!=-1){
            //tim thay
            //gia su muon sua moi ten thoi
            System.out.println("Nhap ten moi cho san pham: ");
            String tenMoi = sc.nextLine();
            sanPhams.get(index).setTenSP(tenMoi);
            //sua tat ca
            //sanPhams.get(index).nhapThongTin();
        }else{
            System.out.println("Khong tim thay san pham can sua.");
        }
    }

    public void nhapKhachHang(){
        KhachHang khachHangMoi = new KhachHang();
        khachHangMoi.nhapThongTin();
        khachHangs.add(khachHangMoi);
    }

    public int timKiemSanPham(String maSP){
        for (int i = 0 ; i<sanPhams.size();++i) {
            if(sanPhams.get(i).getMaSP().equalsIgnoreCase(maSP)){
                return i;
            }
        }
        return -1;
    }


}
