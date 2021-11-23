package Buoi4.Bai14;

public class HsChuyenToan extends HocSinh{

	@Override
	public float dtb() {
		return (getToan() * 2 + getLy() + getHoa())/4;
	}

	public HsChuyenToan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HsChuyenToan(String name, String clasS, float toan, float ly, float hoa) {
		super(name, clasS, toan, ly, hoa);
		// TODO Auto-generated constructor stub
	}

	
}
