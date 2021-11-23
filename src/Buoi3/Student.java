package Buoi3;

import java.util.Scanner;

public class Student {

	public String MSV;
	public double DTB;
	public int age;
	public String classs;
	
	public Student() {
	}

	public Student(String mSV, double dTB, int age, String classs) {
		super();
		MSV = mSV;
		DTB = dTB;
		this.age = age;
		this.classs = classs;
	}
	public boolean check(double DTB) {
		
		return 0<=DTB && DTB<=10;// 0<=DTB<=10
	}
	public boolean check(String classs) {
		return classs.length() < 8 && !classs.contains(" ");//nhỏ hơn 8 kí tự và không chứa dấu cách
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input infomation");
		System.out.println("MSV: ");
		setMSV(sc.nextLine());
		System.out.println("Age: ");
		setAge(sc.nextInt());
		System.out.println("Class: ");
		setClasss(sc.nextLine());
		System.out.println("DTB : ");
		setDTB(sc.nextDouble());
		sc.close();
	}
	

	public String printInfo() {
		return "Student [MSV=" + MSV + ", DTB=" + DTB + ", age=" + age + ", classs=" + classs + ", getMSV()=" + getMSV()
				+ ", getDTB()=" + getDTB() + ", getAge()=" + getAge() + ", getClasss()=" + getClasss() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public boolean hocBong() {
		return DTB>8;
	}
	
	public String getMSV() {
		return MSV;
	}

	public void setMSV(String mSV) {
		MSV = mSV;
	}

	public double getDTB() {
		return DTB;
	}

	public void setDTB(double dTB) {
		if(check(dTB))
			DTB = dTB;
		else
			System.out.println("du lieu nhap khong hop le");
	}
	
	public void setClasss(String classs) {
		if(check(classs))
			this.classs = classs;
		else
			System.out.println("du lieu nhap khong hop le");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClasss() {
		return classs;
	}

	

	
}
