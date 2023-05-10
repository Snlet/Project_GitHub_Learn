package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_with_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[5];

		
		Scanner sc =  new Scanner(System.in);
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
