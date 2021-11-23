package Buoi3;

public class MyPoint {
	public int x,y;
	
	public MyPoint() {
	}

	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "( getX()=" + getX() + ", getY()=" + getY() +")";
	}

	public double distance(int x, int y) {
		double tmpX = x - this.x;
		double tmpY = y - this.y;
		return Math.sqrt(tmpX*tmpX + tmpY*tmpY);
	}
	
	public double distance(MyPoint point1) {
		double tmpX = point1.getX() - this.x;
		double tmpY = point1.getY() - this.y;
		return Math.sqrt(tmpX*tmpX + tmpY*tmpY);
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
