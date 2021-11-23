package Buoi3;

public class SNT {
	int a;

	public SNT() {
	}

	public SNT(int a) {
		if(isPrime(a))
			this.a = a;
		else {
			System.out.println("Khong phai SNT - Khong luu tru!");
		}
	}
	public int primeNext() {
		int x = this.a;
		while(!isPrime(++x));
		return x;
	}
	
	boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }

	public int getA() {
		return a;
	}

	public void setA(int a) {
		if(isPrime(a))
			this.a = a;
		else {
			System.out.println("Khong phai SNT - Khong set !");
		}
	}
	
	

}
