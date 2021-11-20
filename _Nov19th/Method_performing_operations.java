package _Nov19th;

import java.util.Scanner;

public class Method_performing_operations {
	
	static double operation(double x,double y,char z) {
		double result=0;
		if(z=='A'||z=='a') {
			result=x+y;
		}else if(z=='B'||z=='b') {
			result=x-y;
		}else if(z=='C'||z=='c') {
			result=x/y;
		}else if(z=='D'||z=='d'){
			result=x*y;
		}else if(z=='E'||z=='e') {
			result=x%y;
		}else {
			System.out.println("Enter valid option");
		}
		return result;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		double a=sc.nextInt();
		System.out.println("Enter 2nd number");
		double b=sc.nextInt();
		
		System.out.println("\nMenu \nA.Addition \nB.Subtraction \nC.Division \nD.Multiplicaton \nE.Modulus");
		System.out.println("\nEnter Your choice(A/B/C/D)");
		char c=sc.next().charAt(0);
		double r=operation(a,b,c);
		sc.close();
		System.out.println("The result is = "+r);
	}

}
