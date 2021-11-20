package _Nov18th;

import java.util.Scanner;

public class Greatest_of_3_ternary_operator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number");
		int c=sc.nextInt();
		String s;
		s=(a>b) ? (a>c) ? "a is the greater number":"c is greater number":(b>c)?"b is greater number":"c is greater";
		System.out.println(s);
		sc.close();
	}

}
