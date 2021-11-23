package Buoi4.Bai15;

public class Mouse extends USB{

	private float discount = 0.2f;

	@Override
	public double sumMoney() {
		return super.sumMoney() * (1-discount);
	}

	@Override
	public String showInfo() {
		return super.showInfo();
	}

	public Mouse() {
		super();
	}

	public Mouse(String id, double price, int quantity) {
		super(id, price, quantity);
	}
	
	
}
