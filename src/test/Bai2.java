package test;

import java.util.Scanner;

public class Bai2 {
//	Viết các chương trình nhập vào một số nguyên n và in ra số nhị phân tương ứng 
//	với n.
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int nhiPhan[] = new int[100];
		int i =0;
		
		while(n!=0) {
			 int du = n%2;
			 nhiPhan[i] = du;
			 i++;
			 n = n /2 ;
		}
		
		for(int j = i-1;j>=0;--j) {
			System.out.print(nhiPhan[j]);
		}
		
	}

}
