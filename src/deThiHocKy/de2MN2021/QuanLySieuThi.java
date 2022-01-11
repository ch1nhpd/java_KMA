package deThiHocKy.de2MN2021;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySieuThi {

	private ArrayList<KhachHang> khachHangs = new ArrayList<>();
	private ArrayList<SanPham> sanPhams = new ArrayList<>();
	private ArrayList<HoaDon> hoaDons = new ArrayList<>();

	private Scanner sc = new Scanner(System.in);

	public static int timSP(String maSP, ArrayList<SanPham> sanPhams) {
		for (int i = 0; i < sanPhams.size(); ++i) {
			if (sanPhams.get(i).getMaSP().equals(maSP)) {
				return i;
			}
		}
		return -1;
	}

	public void nhapSanPham() throws ParseException {
		System.out.println("Nhap ma SP: ");
		String maSPMoi = sc.nextLine();
		int index = timSP(maSPMoi, sanPhams);
		if (index == -1) {
			System.out.println("-Nhap thong tin san pham moi-");
			SanPham spNew = new SanPham();
			spNew.nhapThongTin(maSPMoi);
			sanPhams.add(spNew);
		} else {
			System.out.println("Nhap so luong san pham moi: ");
			int soLuong = Integer.parseInt(sc.nextLine());
			sanPhams.get(index).tangSoLuong(soLuong);
		}
	}

	public void suaSanPham(String maSP) throws ParseException {
		int index = timSP(maSP, sanPhams);
		if (index != -1) {
			System.out.println("Nhap thong tin moi cho san pham: ");
			sanPhams.get(index).nhapThongTin();
		} else {
			System.out.println("Khong tim thay san pham co ma " + maSP);
		}
	}

	public void hienThiCacSanPham() {
		System.out.println("Danh sach cac san pham sieu thi dang co: ");
		for (SanPham sanPham : sanPhams) {
			System.out.println(sanPham.xuatThongTin());
		}
	}

	public void themKhachHang() {
		System.out.println("Nhap thong tin khach hang moi: ");
		KhachHang khNew = new KhachHang();
		khNew.nhapThongTin();
		khachHangs.add(khNew);
	}

	public int timKH(String maKH) {
		for (int i = 0; i < khachHangs.size(); ++i) {
			if (khachHangs.get(i).getMaKH().equals(maKH)) {
				return i;
			}
		}
		return -1;
	}

	public void tongTienMax() {
		for (KhachHang khachHang : khachHangs) {
			khachHang.setTongTien();
		}
		double tongTiemMax = khachHangs.get(0).getTongTien();
		int indexMax = 0;
		for (int i = 0; i < khachHangs.size(); ++i) {
			double tmp = khachHangs.get(i).getTongTien();
			if (tmp > tongTiemMax) {
				tongTiemMax = tmp;
				indexMax = i;
			}
		}
		System.out.println("Thong tin khach hang mua nhieu tien nhat: ");
		System.out.println(khachHangs.get(indexMax).xuatThongTin());
	}

	public void muaHang() {
		System.out.println("MUA HANG");
		System.out.println("Nhap ma khach hang cua ban de mua hang: ");
		String maKH = sc.nextLine();
		int indexKH = timKH(maKH);
		if (indexKH == -1) {
			System.out.println("Ma KH khong dung!");

		} else {
			HoaDon hdNew = new HoaDon("HD" + hoaDons.size(), maKH);
			hdNew.nhapThongTin(sanPhams);
			hoaDons.add(hdNew);
			khachHangs.get(indexKH).hoaDons.add(hdNew);
		}

	}
	
	public void inHoaDon() {
		for (HoaDon hoaDon : hoaDons) {
			System.out.println(hoaDon.xuatThongTin());
			System.out.println("-------------------------");
		}
	}
	public void inKH() {
		for (KhachHang khachHang : khachHangs) {
			System.out.println(khachHang.xuatThongTin());
			for(int i = 0; i<khachHang.hoaDons.size();++i) {
				System.out.println(khachHang.hoaDons.get(i).xuatThongTin());
			}
			System.out.println("-------------------------");
		}
	}

}
