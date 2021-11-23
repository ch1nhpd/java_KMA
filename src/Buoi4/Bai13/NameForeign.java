package Buoi4.Bai13;

public class NameForeign extends NameVie{

	@Override
	public String showName() {
		return super.getLastName() + " " +  super.getFirstName().toUpperCase();
	}

	public NameForeign() {
		super();
	}

	public NameForeign(String firstName, String lastName) {
		super(firstName, lastName);
	}

	
}
