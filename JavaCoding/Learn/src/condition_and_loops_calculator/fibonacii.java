package condition_and_loops_calculator;

public class fibonacii {

	public static void main(String[] args) {
		
		int a = 0; 
		int b = 1;
		
		int n = 9;
		
		
		int temp;
		
		if(n ==0) {
			System.out.println("0");
		}else if(n ==1) {
			System.out.println("1");
		}else {
		
		for(int i = 2 ; i<=n ; i++) {
			
			//a = 0
			//b =1
			//3rd pointer pe he
			temp =a;
			a=b;
			b=a+temp;
			
			
			
			
		}
		System.out.println(b);
		
		}
		

	}

}
