package Buoi3;

public class Main {

	public static void main(String[] args) {
		SNT snt1 = new SNT();
		SNT snt2 = new SNT(17);
		SNT snt3 = new SNT(6);

		snt1.setA(19);
		
		System.out.println(snt2.primeNext());
		System.out.println(snt1.getA());
	}

}
