package test;

import java.util.Scanner;

public class Bai1_1 {
	
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = s.nextInt();
		double tong = 0;
		for(int i = 1 ; i<n; i++) {
			tong = tong + i/(i+1);
		}
		System.out.println("tong la: "+ tong);
	}
}
