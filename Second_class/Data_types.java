package Second_class;

import java.util.Scanner;

public class Data_types {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("you entered  -"+ name);
		
		System.out.println("Enter integer value");
		int a=sc.nextInt();
		
		System.out.println("Enter your salary");
		float s=sc.nextFloat();
		
		System.out.println("enter m/f");
		char g=sc.next().charAt(0);
		System.out.println("your gender is  " +g);
		
		System.out.println("Enter double number");
		double f=sc.nextDouble();
		
		System.out.println("\n");
		System.out.println("do you want to continue");
		sc.nextBoolean();
		
		
	}

}
