package Buoi4.Bai14;

public class HocSinh {

	private String name;
	private String clasS;
	private float toan;
	private float ly;
	private float hoa;
	
	public float dtb() {
		return (toan+ly+hoa)/3;
	}
	
	public HocSinh() {
	}
	public HocSinh(String name, String clasS, float toan, float ly, float hoa) {
		super();
		this.name = name;
		this.clasS = clasS;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClasS() {
		return clasS;
	}
	public void setClasS(String clasS) {
		this.clasS = clasS;
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getLy() {
		return ly;
	}
	public void setLy(float ly) {
		this.ly = ly;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	
	
	
	
	
}
