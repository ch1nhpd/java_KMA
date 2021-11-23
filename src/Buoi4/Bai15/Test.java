package Buoi4.Bai15;

public class Test {
	public static void main(String[] args) {
		USB u1 = new USB("A01", 199000.23, 2);
		System.out.println("USB: "+ u1.showInfo());
		
		Mouse m1 = new Mouse("A01", 199000.23, 2);
		System.out.println("Mouse: "+ m1.showInfo());
	}
	
	

}
