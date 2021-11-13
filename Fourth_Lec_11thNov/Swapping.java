package Fourth_Lec_11thNov;

import java.util.Scanner;

public class Swapping {
public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		
		System.out.println("1st = "+a);
		System.out.println("2nd = "+b);
		sc.close();
		
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("\nAfter Swaping -");
		System.out.println("1st = "+a);
		System.out.println("2nd = "+b);
				
	}

}
