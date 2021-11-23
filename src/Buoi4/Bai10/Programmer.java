package Buoi4.Bai10;

public class Programmer extends Student{

	private int expYears;

	public Programmer() {
		super();
	}

	public Programmer(String name, String gT, int age, String stdCode, int expYears) {
		super(name, gT, age, stdCode);
		this.expYears = expYears;
	}

	public int getExpYears() {
		return expYears;
	}

	public void setExpYears(int expYears) {
		this.expYears = expYears;
	}
	
	
}
