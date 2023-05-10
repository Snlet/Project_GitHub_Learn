package condition_and_loops_calculator;

public class coutning_occurence_of_number {

	public static void main(String[] args) {
		int n = 385757879;
		int count  = 0;
		 while(n>0) {
			 int rem = n%10;
			 
			 if(rem == 7) {
				 count++;
			 }
			 n = n/10;
		 }
		System.out.println(count);
	}

}
