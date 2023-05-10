package condition_and_loops_calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner input  =  new Scanner(System.in);
		int ans;
		while(true) {
			char op = input.next().trim().charAt(0);
			
			if(op == '+' ||op == '-' || op == '/' || op == '*' || op == '%') {
				
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				
				if(op == '+') {
					ans = num1+num2;
					System.out.println(ans);
				}else if(op == '-') {
					ans = num1-num2;
					System.out.println(ans);
				}else if(op == '/') {
					if(num2 == 0) {
						System.out.println("not divisible by zero");
					}else {
					ans = num1/num2;
					System.out.println(ans);
					}
					
				}else if(op == '*') {
					ans = num1*num2;
					System.out.println(ans);
				}else if(op == '%') {
					ans = num1%num2;
					System.out.println(ans);
				}	
			}else if(op == 'x' || op == 'X') {
				System.out.println("calc closed");
				break;
			}
			
			else {
				System.out.println("enter a valid operand");
			}
			
			
		}
//		System.out.println(ans);
	}

}
