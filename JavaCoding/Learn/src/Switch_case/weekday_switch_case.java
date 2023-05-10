package Switch_case;

import java.util.Scanner;

public class weekday_switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		
		switch (day) {
		case 1:		
		case 2:		
		case 3:						
		case 4:			
		case 5:
			
		case 6:
			System.out.println("Weekday");
			break;
		case 7:
			System.out.println("Weekend");
			break;

		default:
			System.out.println("No fruit found");
			break;
		}

	}

}
