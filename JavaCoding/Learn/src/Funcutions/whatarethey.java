package Funcutions;

import java.util.Scanner;

import javax.swing.Spring;

public class whatarethey {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int a =  sc.nextInt();
		int b = sc.nextInt();
		
		
		sum( a,b);
		
//		String str = greet();
//		System.out.println(str);
		
		

	}
	
	static String greet() {
		return "Hello Good Morning ";
	}
	
	
	static void sum(int num1 , int num2) {
		Scanner sc =  new Scanner(System.in);
//		int num1 =  sc.nextInt();
//		int num2 = sc.nextInt();
		int sum  = num1+num2;
		System.out.println("sum is " +sum);
		
	}

}
