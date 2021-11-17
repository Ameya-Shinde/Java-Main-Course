package _Nov15th;

import java.util.Scanner;

public class difftypes_multiply_methods {
	
	static float multiply(float x,float y) {
		float r=x*y;
		return r;
	}
	static int multiply(int x,int y) {
		int r=x*y;
		return r;
	}
	static long multiply(long x,long y) {
		long r=x*y;
		return r;
	}
	static double multiply(int x,float y,long z) {
		double r=(x*z)*y;
		return r;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char C;
		do {
		System.out.println("which numbers do you want to multiply?\n1.Integers \n2.Float \n3.Long \n4.mix of all");
		int ch=sc.nextInt();
		
		if(ch==1) {
		System.out.println("Enter 1st number - ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number - ");
		int b=sc.nextInt();
		
		int prod=multiply(a,b);
		System.out.println("The multiplication is = "+ prod);
		}else if(ch==2) {
			System.out.println("Enter 1st number - ");
			float a=sc.nextFloat();
			System.out.println("Enter 2nd number - ");
			float b=sc.nextFloat();
			
			float prod=multiply(a,b);
			System.out.println("The multiplication is = "+ prod);
		}else if(ch==3) {
			System.out.println("Enter 1st number - ");
			long a=sc.nextLong();
			System.out.println("Enter 2nd number - ");
			long b=sc.nextLong();
			
			long prod=multiply(a,b);
			System.out.println("The multiplication is = "+ prod);
		}else if(ch==4){
			System.out.println("Enter int value - ");
			int a=sc.nextInt();
			System.out.println("Enter float value - ");
			float b=sc.nextFloat();
			System.out.println("Enter long value - ");
			long c=sc.nextLong();
			double prod=multiply(a,b,c);
			System.out.println("The multiplication is = "+ prod);
		}
		else {
			System.out.println("Invalid choice");
		}
		System.out.println("Do you wish to continue?(yes/no)");
		C=sc.next().charAt(0);
		}while(C=='y'||C=='Y');
		sc.close();
	}
}
