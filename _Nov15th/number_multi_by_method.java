package _Nov15th;

import java.util.Scanner;

public class number_multi_by_method {
	
	static float multiply(float x,float y) {
		float r=x*y;
		return r;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number - ");
		float a=sc.nextFloat();
		System.out.println("Enter 2nd number - ");
		float b=sc.nextFloat();
		sc.close();
		float prod=multiply(a,b);
		System.out.println("The multiplication is - "+ prod);
		
	}

}
