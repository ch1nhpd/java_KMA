package Buoi4.Bai10;

public class Student extends Person{

	private String stdCode;
	
	

	public Student() {
		super();
	}

	public Student(String name, String gT, int age, String stdCode) {
		super(name, gT, age);
		this.stdCode = stdCode;
	}

	public String getStdCode() {
		return stdCode;
	}

	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}
	
	
}
