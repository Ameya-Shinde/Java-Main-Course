package Third_lec_10thNov;

import java.util.Scanner;

public class Temp_F_to_C {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temperature in Farenheit");
		float f=sc.nextFloat();
		
		sc.close();
		float c=(f-32)*5/9;
		System.out.println("The temperature in Celsius is ");
		System.out.println(c);
		
	}

}
