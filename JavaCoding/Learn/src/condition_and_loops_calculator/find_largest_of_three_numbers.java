package condition_and_loops_calculator;

import java.util.Scanner;

public class find_largest_of_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a =input.nextInt();
		int b =  input.nextInt();
		int c =  input.nextInt();
		
		int num = Math.max(a, Math.max(b, c));
		System.out.println(num);
		
//		if(a>b && a>c) {
//			System.out.println(a+" is greates of three");
//		}else if(b>a && b>c) {
//			System.out.println(b+" is greates of three");
//		}else if(c>b && c>a) {
//			System.out.println(c+" is greates of three");
//		}
		
		//optimised solution//
		
//		int max = a;
//		
//		if(b>max) {
//			max = b;
//		}
//		if(c > max) {
//			max = c;
//			System.out.println(max);
//		}
//		
//		System.out.println("largest number is "+max);
//		
		
		
		
	}

}
