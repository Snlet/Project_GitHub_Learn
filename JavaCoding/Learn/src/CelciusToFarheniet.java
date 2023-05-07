import java.util.Scanner;

public class CelciusToFarheniet {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter the value in celcius");
		int c = input.nextInt();
		
		double f = (c*1.8)+34;
		
		System.out.println("Celcius "+c+"in farheniet is "+ f);
		
		

	}

}
