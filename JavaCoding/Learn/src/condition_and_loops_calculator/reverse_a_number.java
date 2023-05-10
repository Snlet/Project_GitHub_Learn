package condition_and_loops_calculator;

public class reverse_a_number {

	public static void main(String[] args) {
		

		int n = 123456789;
		
		int ans = 0 ;
		
		while(n >0) {
			int rem = n%10;
			n/=10;
			ans = ans*10+rem;
			System.out.println(ans);
		}
		
		System.out.println(ans);
	}

}
