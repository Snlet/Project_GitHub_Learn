package condition_and_loops_calculator;

import java.util.Scanner;

public class check_is_capitlal_or_not {

	public static void main(String[] args) {
	
		Scanner input =  new Scanner(System.in);
		
		char ch = input.next().trim().charAt(0);
		
		
		
		if(ch>='a' && ch <='z') {
			System.out.println("It is a small alphabet");
		}
		else{
			System.out.println("it is big alphabet: ");
		}

	}

}
