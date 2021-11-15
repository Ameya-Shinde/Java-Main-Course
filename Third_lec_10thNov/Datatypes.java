package Third_lec_10thNov;

import java.util.Scanner;

public class Datatypes {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the integer");
		int a=sc.nextInt();
		System.out.println("Enter the decimal");
		double d=sc.nextDouble();
		System.out.println("Enter the charecter");
		char c=sc.next().charAt(0);
		sc.close();
		
		System.out.println("the entered integer is -");
		System.out.println(a);
		System.out.println("the entered decimal is -");
		System.out.println(d);
		System.out.println("the entered charecter is -");
		System.out.println(c);
		
	}

}
