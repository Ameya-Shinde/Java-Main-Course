package Second_class;

import java.util.Scanner;

public class Second_lec {
	public static void main(String agrs[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 1st number--");
		int a=s.nextInt();
		System.out.println("Enter 2nd number--");
		int b=s.nextInt();
		
		if(a<b) {
			System.out.println("a is Smaller than b");
		}else if(b<a){
			System.out.println("b is Smaller than a");
		}else {
			System.out.println("a is equal to b");
		}
		
		
		
	}

}
