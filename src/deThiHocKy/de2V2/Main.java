package deThiHocKy.de2V2;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        QuanLy qlst = new QuanLy();
        int chon;
        while (true){
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    qlst.nhapSanPham();
                    break;
                case 2:
                    qlst.nhapKhachHang();
                    break;
                case 3:
                    qlst.suaSanPham();
                    break;
                case 4:
                    qlst.inTatCaSanPham();
                    break;
                case 5:
                    qlst.muaHang();
                    break;
                case 6:
                    System.out.println(qlst.khachHangVip());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("KHONG HOP LE!");



            }
        }
    }
    public static void menu() {
        System.out.println("1. Them san pham");
        System.out.println("2. Them khach hang");
        System.out.println("3. Thay doi thong tin san pham");
        System.out.println("4. In danh sach san pham");;
        System.out.println("5. Mua hang");
        System.out.println("6. Hien thi KH mua nhieu tien nhat.");
//        System.out.println("7. In hoa don");
//        System.out.println("8. In khach hang");
        System.out.println("0. Thoat");
        System.out.print("Nhap lua chon: ");
    }
}
