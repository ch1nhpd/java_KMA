package Buoi3;

import java.util.Scanner;

public class NhanVien {
	public String name;
	public int times;
	public int age;
	public double salarry;
	public String address;

	public NhanVien() {
	}

	public NhanVien(String name, int times, int age, double salarry, String address) {
		super();
		this.name = name;
		this.times = times;
		this.age = age;
		this.salarry = salarry;
		this.address = address;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input infomation");
		System.out.println("Name: ");
		setName(sc.nextLine());
		System.out.println("Times work: ");
		setTimes(sc.nextInt());
		System.out.println("Address: ");
		setAddress(sc.nextLine());
		System.out.println("Age: ");
		setAge(sc.nextInt());
		System.out.println("Salarry: ");
		setSalarry(sc.nextDouble());
		sc.close();
	}
	

	public String showInfo() {
		return "NhanVien [name=" + name + ", times=" + times + ", age=" + age + ", salarry=" + salarry + ", address="
				+ address + ", getName()=" + getName() + ", getTimes()=" + getTimes() + ", getAge()=" + getAge()
				+ ", getSalarry()=" + getSalarry() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public double tinhThuong() {
		if(times>200) {
			return salarry/5;
		}else if(times>=100) {
			return salarry/10;
		}else {
			return 0;
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalarry() {
		return salarry;
	}

	public void setSalarry(double salarry) {
		this.salarry = salarry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
