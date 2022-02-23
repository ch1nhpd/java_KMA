/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deThiHocKy.de1MN2021;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
	public static void menu() {
		System.out.printf("Menu \n");
		System.out.printf("1.Sieu thi nhap san pham.\n");
		System.out.printf("2.Sieu thi co the them mot khach hang bat ki.\n");
		System.out.printf("3.Thay doi ten hoac nam sinh cua khach hang co ma hang tuong ung.\n");
		System.out.printf("4.In danh sach cac san pham ra man hinh ma sieu thi co.\n");
		System.out.printf("5.Khach hang mua san pham.\n");
		System.out.printf(
				"6.Sap xep theo thu tu tang dan so tien ma khach hang da mua va in cac khach hang nay ra man hinh.\n");
		System.out.printf("7.Thoat\n");
	}

	public static void main(String[] args) {
		SieuThi st = new SieuThi();
		Scanner sc = new Scanner(System.in);
		st.fakeData();
		while (true) {
			menu();
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				st.nhapSP();
				break;
			case 2:
				st.nhapthemKH();
				st.inKH();
				break;
			case 3:
				st.doiTTKH();
				break;
			case 4:
				st.inDanhSachSP();
				break;
			case 5:
				st.muaHang();
				break;
			case 6:
				st.sapXep();
				st.inKH();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Khong co lua chon nay! Moi nhap lai");

			}
		}

	}

}
