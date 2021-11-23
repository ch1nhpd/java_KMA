package Buoi4.Bai12;

public class GiangVien extends Nguoi{
	private double salary;

	public GiangVien() {
		super();
	}

	public GiangVien(String name, int birthYear, String code,double salary) {
		super(name, birthYear, code);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
