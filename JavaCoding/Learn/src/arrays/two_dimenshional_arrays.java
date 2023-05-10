package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class two_dimenshional_arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [][]arr = {{0,0},
						{0,0 ,0 ,0 ,0},
						{0 , 0, 0,0}};
		
		for(int row = 0 ; row<arr.length ; row++) {
			for(int col = 0 ; col < arr[row].length ; col++) {
				
				arr[row][col] = sc.nextInt();		
			}
		}
		
		
		for(int row = 0 ; row<arr.length ; row++) {
			for(int col = 0 ; col < arr[row].length ; col++) {
				
				System.out.print(arr[row][col]+" ");		
			}
			System.out.println();
		}
		
		
		
//		System.out.println(Arrays.toString(arr));
//		for(int[] ele:arr) {
//			System.out.println(ele);
//		}

	}

}
