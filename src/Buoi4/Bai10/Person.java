package Buoi4.Bai10;

public class Person {
	private String name;
	private String GT;
	private int age;
	
	
	
	public Person() {
	}



	public Person(String name, String gT, int age) {
		this.name = name;
		this.GT = gT;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGT() {
		return GT;
	}



	public void setGT(String gT) {
		GT = gT;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
