package Fourth_Lec_11thNov;

import java.util.Scanner;

public class Factorial {
public static void main(String args[]) {
		
		int fact=1;
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		s.close();
		
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
