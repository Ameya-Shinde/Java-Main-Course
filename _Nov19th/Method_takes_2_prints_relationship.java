package _Nov19th;

import java.util.Scanner;

public class Method_takes_2_prints_relationship {

	static String relation(int x,int y) {
		String r;
		r=(x>y)?"a is greater than b":(y>x)?"b is greater than a":"The numbers are equal";
		return r;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		String s=relation(a,b);
		System.out.println(s);
		sc.close();
	}

}
