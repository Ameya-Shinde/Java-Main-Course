package Third_lec_10thNov;

import java.util.Scanner;

public class Inch_to_Meters {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the length in Inches = ");
		float i=sc.nextFloat();
		sc.close();
		float m=i/39.37f;
		System.out.print("The converted length in Meters is = ");
		System.out.print(m);	
		
	}

}
