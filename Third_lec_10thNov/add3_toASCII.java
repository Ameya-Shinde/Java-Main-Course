package Third_lec_10thNov;

import java.util.Scanner;

public class add3_toASCII {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Character");
		
		char c=sc.next().charAt(0);
		sc.close();
		int a=c;
		System.out.println("ASCII of the entered Character");
		System.out.println(a);
		
		int b=a+3;
		System.out.println("ASCII after adding 3");
		System.out.println(b);
		
		char r=(char)b;
		System.out.println("Its equivalent character is");
		System.out.println(r);
		
	}

}
