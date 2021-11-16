package Seventh_lec16thNov;

import java.util.Scanner;

public class Digits_in_a_number {
	public static String digits(int x) {
		String f;
		int c=0;
		if(x>=10000) {
			f="Number is very high";
		}else {
		while(x>0) {
			x=x/10;
			c++;
		}
		f="You have entered a "+c+" digit number";
		}
		return f;	
	}
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	char ch;
	do {
	System.out.println("Enter your number");
	int a=sc.nextInt();
	
	String r=digits(a);
	System.out.println(r);
	System.out.println("\nDo you wish to continue?(Yes/No)");
	 ch=sc.next().charAt(0);
	 System.out.println();
	}while(ch=='y' || ch=='Y');
	sc.close();
}

}
