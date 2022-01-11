package test.scannerT;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.nextLine();
		int i1 = Integer.parseInt(sc1.nextLine());
		System.out.println("sc1: "+str1+"  "+ i1);
		sc1.close();
		System.out.println("--");
		Scanner sc2 = new Scanner(System.in);
		String str2 = sc2.nextLine();
		int i2 = Integer.parseInt(sc2.nextLine());
		System.out.println("sc2: "+str2+"  "+ i2);
		sc2.close();
		//==> use single scanner or not close sc.
	}
}
