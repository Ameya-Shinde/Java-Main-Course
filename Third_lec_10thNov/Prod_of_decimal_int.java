package Third_lec_10thNov;

import java.util.Scanner;

public class Prod_of_decimal_int {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the decimal");
		float f=sc.nextFloat();
		
		System.out.println("Enter the integer");
		int a=sc.nextInt();
		
		sc.close();
		float prod;
		
		prod=a*f;
		System.out.println(prod);
		
		
		
	}

}
