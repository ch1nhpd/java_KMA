package deThiHocKy.de2MN2021;

import java.text.ParseException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws ParseException {
		QuanLySieuThi sieuThi = new QuanLySieuThi();
		Scanner sc = new Scanner(System.in);
		int chon;
		while(true) {
			menu();
			chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1 : 
				sieuThi.nhapSanPham();
				break;
			case 2 : 
				sieuThi.themKhachHang();
				break;
			case 3 : 
				System.out.println("Nhap ma sp can sua: ");
				String maSp = sc.nextLine();
				sieuThi.suaSanPham(maSp);
				break;
			case 4 : 
				sieuThi.hienThiCacSanPham();
				break;
			case 5 : 
				sieuThi.muaHang();
				break;
			case 6 : 
				sieuThi.tongTienMax();
				break;
			case 7 : 
				sieuThi.inHoaDon();
				break;
			case 8 : 
				sieuThi.inKH();;
				break;
			case 0 : 
				System.exit(0);
			default:
				System.out.println("Lua chon khong hop le!");
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
		System.out.println("7. In hoa don");
		System.out.println("8. In khach hang");
		System.out.println("0. Thoat");
		System.out.print("Nhap lua chon: ");
	}
}
