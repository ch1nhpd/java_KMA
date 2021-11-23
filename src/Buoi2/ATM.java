package Buoi2;

public class ATM {
	public int money;
	public int menhGia[] = {500,200,100,50,20,10};
	
	public void rutTien() {
		int tmp = money;
		int i = 0;
		int count = 0;
		System.out.println("--Rut tien--");
		while (tmp>=0&&i<6) {
			if(tmp>=menhGia[i])
			{
				count++;
				tmp-=menhGia[i];
			}else if(count>0) {
				System.out.println("Menh gia: "+menhGia[i]+" So Luong: "+count);
				count = 0;
				i++;
			}else {
				i++;
			}
		}
	}

}
