package Buoi4.Bai10;

public class Manage extends Employee{

	private double luongTN;
	
	@Override
	public double salaryCalc() {
		return super.salaryCalc() + this.luongTN;
	}

	public Manage() {
		super();
	}

	public Manage(String name, String gT, int age, double salary, float hsl, double luongTN) {
		super(name, gT, age, salary, hsl);
		this.luongTN = luongTN;
	}

	public double getLuongTN() {
		return luongTN;
	}

	public void setLuongTN(double luongTN) {
		this.luongTN = luongTN;
	}
	
	
}
