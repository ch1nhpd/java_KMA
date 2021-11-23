package Buoi4.Bai13;

public class NameVie {

	private String firstName;//ho
	private String lastName;//dem+ten
	public String showName() {
		return firstName+ " " + lastName;
	}
	
	public NameVie() {
		super();
	}


	public NameVie(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
