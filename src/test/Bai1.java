package test;

import java.util.Scanner;

public class Bai1 {
	
	public static void main(String args[]){
		Scanner w = new Scanner(System.in);
		int a=0, b=0;
		System.out.println("Nhap so a=");
		a = w.nextInt();
		System.out.println("Nhap so b=");
		b = w.nextInt();
		System.out.println("tong a+b=" + (a+b) + "hieu a-b=" + (a-b));
	}
	
}
