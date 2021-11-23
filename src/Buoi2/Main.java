package Buoi2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Student chinh = new Student();
		chinh.name = "Phạm Đăng Chính";
		chinh.studentCode = "AT160208";
		chinh.birthYear = 2001;
		
		System.out.println("Name: "+ chinh.name);
		System.out.println("Student code: "+chinh.studentCode);
		System.out.println("Birth year: "+ chinh.birthYear);
		*/
		
//		Cat doraemon = new Cat("Doraemon","VietNam",2);
//		System.out.println(doraemon.showInfo());
//		
//		Officer chinpd = new Officer("Pham Dang Chinh", "Viet Nam", "Nam", 2001, "Hai Duong");
//		System.out.println(chinpd.showInfo());
		
		ATM mb = new ATM();
		System.out.println("Nhap so tien: ");
		mb.money = new Scanner(System.in).nextInt();
		mb.rutTien();
		
	}

}
