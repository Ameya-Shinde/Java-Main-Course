package _Nov18th;

import java.util.Scanner;

public class Greatest_of_2_ternary_operator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		
		String s;
		s=(a>b)?"a is greater than b":(b>a)?"b is greater than a":"Both are equal";
		sc.close();
		System.out.println(s);
	}

}
