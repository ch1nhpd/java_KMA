package Buoi2;

public class Cat {
	public String name;
	public String country;
	public int age;
	
	
	
	public Cat() {
		super();
	}

	public Cat(String name, String country, int age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}

	public String showInfo() {
		return "Cat [name=" + name + ", country=" + country + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
