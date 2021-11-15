package Third_lec_10thNov;

import java.util.Scanner;

public class ASCII_value {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Charecter of which ASCII value is required");
		
		char c=sc.next().charAt(0);
		sc.close();
		int a=c;
		System.out.println(a);
		
	}

}
