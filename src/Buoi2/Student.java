package Buoi2;

public class Student {
	public String name;
	public String studentCode;
	public int birthYear;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void showInfo() {
		System.out.println("Student [name=\" + name + \", studentCode=\" + studentCode + \", birthYear=\" + birthYear + \"]");
	}
	public void showInfo(String className) {
		System.out.println("==================");
		System.out.println("className: "+className);
		System.out.println("Student name: "+name);
		System.out.println("Student code: "+studentCode);
		System.out.println("Birth year: "+birthYear);
	}
	public Student(String name, String studentCode, int birthYear) {
		super();
		this.name = name;
		this.studentCode = studentCode;
		this.birthYear = birthYear;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentCode=" + studentCode + ", birthYear=" + birthYear + "]";
	}
	
	
}
