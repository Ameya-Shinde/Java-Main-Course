package _Nov23rd;

import java.util.Scanner;

public class Binary_to_Decimal {
	
	static int btod(int bn) {
		int d=0;
		int p=0;
		while(bn!=0) {
			int temp=bn%10;
			d+=temp*Math.pow(2,p);
			bn=bn/10;
			p++;
		}
		return d;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Binary number");
		int bn=sc.nextInt();
		System.out.println("Its Decimal equivalent is");
		int r=btod(bn);
		System.out.println(r);
		sc.close();
		
	}
}
