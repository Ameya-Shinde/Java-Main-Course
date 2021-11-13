package Second_class;

import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("Enter the number you want to check");
		int num=n.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"  is even number");
		}else {
			System.out.println(num+"  is odd number");
		}
		
	}

}
