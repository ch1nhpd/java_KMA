package Buoi2;

public class Officer {
	public String name;
	public String country;
	public String gender;
	public int yearOfBirth;
	public String address;
	

	public Officer() {
		super();
	}
	public Officer(String name, String country, String gender, int yearOfBirth, String address) {
		super();
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}
	public String showInfo() {
		int age = 2021 - yearOfBirth;
		return "Officer [name=" + name + ", country=" + country + ", gender=" + gender + ", age=" + age
				+ ", address=" + address + "]";
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
