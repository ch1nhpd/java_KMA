package test;

public class ToanHoc {

	int n;
	
	public boolean soNguyenTo() {
		
		for(int i = 2 ; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
