package Buoi10.Bai2Page40;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HoDan[] hds;
		int soLuongHD;
		System.out.print("Nhap SLHD: ");
		soLuongHD = Integer.parseInt(sc.nextLine());
		hds = new HoDan[soLuongHD];
		for(int i = 0; i< soLuongHD;++i) {
			hds[i] = new HoDan();
			System.out.println("Nhap thong tin ho dan " + (1+i));
			hds[i].nhapThongTin();
		}
		System.out.println("================");
		for(int i = 0; i< soLuongHD;++i) {
			System.out.println(hds[i].xuatThongTin());
		}
		sc.close();
	}
}
