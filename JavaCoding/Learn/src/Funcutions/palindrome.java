package Funcutions;

import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
//		int n = sc.nextInt();
//		
//		System.out.println(armstrong(n));
		
		
		for(int i= 100; i<1001;i++) {
			if(armstrong(i)) {
				
				System.out.println(i);
			}
		}
	}
	public static boolean armstrong(int n) {
		
		int n_og = n;
		int rem;
		int num = 0;
		
		while(n >0) {
			rem = n%10;
			num = num+rem*rem*rem;
//			System.out.println(n);
//			System.out.println(num);
			n /=10;
		}
		
		if(num == n_og) {
			return true;
		}
		if(num != n_og) {
			return false;
		}
		
		
		return true;
	}

}
