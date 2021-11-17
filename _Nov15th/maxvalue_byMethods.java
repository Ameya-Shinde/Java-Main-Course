package _Nov15th;

import java.util.Scanner;

public class maxvalue_byMethods {
	
	static int maxvalue(int x,int y) {
		 int m=0;
		if(x>y) {
			 m=x;
		}else if(y>x) {
			 m=y;
		}else {
			System.out.println("The numbers are equal");
		}
		return m;	
	}
	static int maxvalue(int x,int y,int z) {
		 int m=0;
		if(x>y && x>z) {
			 m=x;
			 
		}else if(y>x && y>z) {
			 m=y;
		}else if(z>x && z>y) {
			m=z;
		}else {
			System.out.println("The numbers are equal");
		}
			return m;
	}
	static int maxvalue(int w,int x,int y,int z) {
		 int m=0;
		if(x>w && x>y && x>z) {
			 m=x;
			 
		}else if(y>w && y>x && y>z) {
			 m=y;
		}else if(z>w && z>x && z>y) {
			m=z;
		}else if(w>x && w>y && w>z) {
			m=w;
		}
		else {
			System.out.println("The numbers are equal");
		}
			return m;
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char C;
		do {
			System.out.println("How many number do you wish to comapre?(2/3/4)");
			int ch=sc.nextInt();
			if(ch==2) {
				System.out.println("Enter 1st number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd number");
				int b=sc.nextInt();
				int max=maxvalue(a,b);
				System.out.println("The maximun value is = "+max);
			}else if(ch==3) {
				System.out.println("Enter 1st number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd number");
				int b=sc.nextInt();
				System.out.println("Enter 3rd number");
				int c=sc.nextInt();
				int max=maxvalue(a,b,c);
				System.out.println("The maximun value is = "+max);
			}else if(ch==4) {
				System.out.println("Enter 1st number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd number");
				int b=sc.nextInt();
				System.out.println("Enter 3rd number");
				int c=sc.nextInt();
				System.out.println("Enter 4th number");
				int d=sc.nextInt();
				int max=maxvalue(a,b,c,d);
				System.out.println("The maximun value is = "+max);
			}
			System.out.println("Do you wish to contnue?(yes/no)");
			C=sc.next().charAt(0);
		}while(C=='y'||C=='Y');
		sc.close();
	}
}
