package Seventh_lec16thNov;

import java.util.Scanner;

public class oddEven_using_function {
	
	static String oddeven(int x) {
		String f;
		if(x%2==0) {
			f="Even";
		}else {
			f="Odd";
		}
		return f;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter the number of which is to be checked");
			int n=sc.nextInt();
			String result=oddeven(n);
			System.out.println("The number is = "+result);
			
			System.out.println("\nDo you wish to continue?(yes/no)");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
		sc.close();
	}

}
