package deThiHocKy.de2MN2021;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon {
	private String maHD;
	ArrayList<SanPham> sanPhams = new ArrayList<>();
	private String maKH;

	public HoaDon(String maHD, String maKH) {
		this.maHD = maHD;
		this.maKH = maKH;
	}
	Scanner sc = new Scanner(System.in);
	public void nhapThongTin(ArrayList<SanPham> sanPhams) {
		String muaTiep = "";
		while (!muaTiep.equals("N")) {
			System.out.println("Nhap ma sp can mua: ");
			String maSP = sc.nextLine();
			int index = QuanLySieuThi.timSP(maSP,sanPhams);
			if (index == -1) {
				System.out.println("Khong ton tai sp co ma " + maSP);
				continue;
			}
			
			System.out.println("Nhap so luong can mua: ");
			int soLuong = Integer.parseInt(sc.nextLine());
			if (sanPhams.get(index).getSoLuong() < soLuong) {
				System.out.println("Khong du so luong de mua");
				continue;
			}else {
				SanPham sp = sanPhams.get(index);
				SanPham spDaMua = new SanPham(sp.getMaSP(), sp.getTenSP(), sp.getDonGia(), sp.getNgaySanXuat(), soLuong);
				this.sanPhams.add(spDaMua);
				sp.giamSoLuong(soLuong);
			}
			

			System.out.println("Len don hang thanh cong!");
			System.out.println("Tiep tuc mua hang ? (Y/N) ");
			muaTiep = sc.nextLine();
		}
	}

	public String xuatThongTin() {
		StringBuilder sb = new StringBuilder();
		sb.append(maHD+"[ MAKH: "+maKH+"Danh sach san pham:\n");
		for (SanPham sanPham : sanPhams) {
			sb.append(sanPham.xuatThongTin()+",\n");
		}
		sb.append("]");
		return sb + "";
	}

	public double tongTien() {
		double tongTien = 0;
		for (SanPham sanPham : sanPhams) {
			sanPham.setThanhTien();
			tongTien += sanPham.getThanhTien();
		}
		return tongTien;
	}
}
