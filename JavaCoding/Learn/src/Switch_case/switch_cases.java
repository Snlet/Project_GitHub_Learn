package Switch_case;

import java.util.Scanner;

public class switch_cases {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	Scanner sc  =  new Scanner(System.in);
	String fruit  = sc.next();
	
	switch (fruit) {
	case "mango":
		System.out.println("King of fruit");
		break;
		
	case "Banana":
		System.out.println("Yellow fruit");
		break;
		
	case "apple":
		System.out.println(" red fruit");
		break;
		
	case "carrot":
		System.out.println("vegetable fruit");
		break;
		
	case "grapes":
		System.out.println("small fruit");
		break;

	default:
		System.out.println("No fruit found");
		break;
	}
	

	}

}
