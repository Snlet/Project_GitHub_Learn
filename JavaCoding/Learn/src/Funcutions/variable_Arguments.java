package Funcutions;

import java.util.Arrays;

public class variable_Arguments {

	public static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	
	public static void main(String[] args) {
		
		fun(1,2,3,4,4,6);
		

	}

}
