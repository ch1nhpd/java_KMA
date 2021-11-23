package Buoi4.Bai15;

public class USB {

	private String id;
	private double price;
	private int quantity;
	
	public double sumMoney() {
		return price * quantity;
	}
	public String showInfo() {
		return "id = " + id + ", price: " + price + 
				", quantity: "+ quantity + ", Sum Money: "+ 1.0*((int) (this.sumMoney()*100))/100;
	}
	public USB() {
		super();
	}

	public USB(String id, double price, int quantity) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
