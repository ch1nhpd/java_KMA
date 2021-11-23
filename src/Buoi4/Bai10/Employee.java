package Buoi4.Bai10;

public class Employee extends Person{

	private double salary;
	private float hsl;
	
	public Employee() {
		super();
	}

	public Employee(String name, String gT, int age, double salary, float hsl) {
		super(name, gT, age);
		this.salary = salary;
		this.hsl = hsl;
	}
	
	public double salaryCalc() {
		return this.salary * this.hsl;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public float getHsl() {
		return hsl;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}
	
	
	
}
