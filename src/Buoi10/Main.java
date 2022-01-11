package Buoi10;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<TheMuon> theMuons = new ArrayList<TheMuon>();
		int soLuong=0;
		String lop = "K3A";
		for (TheMuon theMuon : theMuons) {
			if(theMuon.getThongTinRieng().getLop().equals(lop)){
				soLuong++;
			}
		}
		System.out.println("Co "+ soLuong+" the muon cua lop " + lop);
		
	}

}
