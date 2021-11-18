package Seventh_lec16thNov;

import java.util.Scanner;

public class Fact_using_dowhile {
	
	static int factorial(int x) {
		int fact=1;
		int i=1;
		while(i<=x) {
			fact=fact*i;
			i++;
		}
		return fact;	
	}	
	
	public static void main(String arsg[]){
		Scanner sc=new Scanner(System.in);
		char ch;
	do {
		System.out.println("Enter the number of which factorial is to be calculated ");
		int n=sc.nextInt();
		int result=factorial(n);
		System.out.println("Factorial of the number is = "+result);
		
		System.out.println("\nDo you wish to continue?(yes/no)");
		ch=sc.next().charAt(0);
		
	}while(ch=='y'||ch=='Y');
	sc.close();
}
}
