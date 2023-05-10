package Funcutions;

public class shadowing {

	static int x = 100;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		
		x = 90;
		info();

	}
	
	public static void info() {
		
		int sum = x*2;
		
		System.out.println("hello "+ sum);
	}

}
